package net.spacegoat.nmtp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.nmtp.blocks.ModBlocks;
import net.spacegoat.nmtp.items.ModItems;
import net.spacegoat.nmtp.items.ModTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	public static final String MOD_ID = "nmtp";
	public static final Logger LOGGER = LogManager.getLogger("no_more_tree_punching");

	@Override
	public void onInitialize() {
		//CLASS REGISTRIES
		ModItems.registerModItems();
		ModTools.registerModTools();
		ModBlocks.registerModBlocks();

		if (NmtpConfig.getConfig().Gameplay.enableBasicTools){
			registerBasicTools();
		}
		if (NmtpConfig.getConfig().Gameplay.enableRockDrops){
			registerRockDrops();
		}

		//DIRECT REGISTRIES
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_axe"),
				ModTools.FLINT_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_pickaxe"),
				ModTools.FLINT_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_hoe"),
				ModTools.FLINT_HOE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_shovel"),
				ModTools.FLINT_SHOVEL);
	}
	private void registerBasicTools(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "basic_tools"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
	private void registerRockDrops(){
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			var added = ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(
					MOD_ID, "rock_drops"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
		});
	}
}
