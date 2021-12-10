package net.spacegoat.nmtp;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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

		//TOOL REGISTRIES
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_axe"),
				ModTools.FLINT_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_pickaxe"),
				ModTools.FLINT_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_hoe"),
				ModTools.FLINT_HOE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_shovel"),
				ModTools.FLINT_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_knife"),
				ModTools.FLINT_KNIFE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_sword"),
				ModTools.FLINT_SWORD);
	}
}
