package net.spacegoat.nmtp;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.nmtp.block.ModBlocks;
import net.spacegoat.nmtp.item.ModItems;
import net.spacegoat.nmtp.item.ModTools;

public class Main implements ModInitializer {
	public static final String MOD_ID = "nmtp";

	@Override
	public void onInitialize() {
		//CLASS REGISTRIES
		ModItems.registerModItems();
		ModTools.registerModTools();
		ModBlocks.registerModBlocks();

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
}
