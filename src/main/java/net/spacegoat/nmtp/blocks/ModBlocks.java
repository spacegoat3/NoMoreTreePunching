package net.spacegoat.nmtp.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.nmtp.Main;

public class ModBlocks {

    private static final Block LOOSE_STONE = registerBlock("loose_stone",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_DEEPSLATE = registerBlock("loose_deepslate",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_ANDESITE = registerBlock("loose_andesite",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_DIORITE = registerBlock("loose_diorite",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_GRANITE = registerBlock("loose_granite",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_SANDSTONE = registerBlock("loose_sandstone",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));
    private static final Block LOOSE_RED_SANDSTONE = registerBlock("loose_red_sandstone",
            new RockBlock(FabricBlockSettings.of(Material.STONE).strength(0.1f).breakByHand(true)
                    .sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
    public static void registerModBlocks(){
        System.out.println("Registering blocks for"+Main.MOD_ID);
    }
}
