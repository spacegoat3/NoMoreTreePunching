package net.spacegoat.nmtp.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.nmtp.Main;
import net.spacegoat.nmtp.items.tools.FlintAxe;
import net.spacegoat.nmtp.items.tools.FlintHoe;
import net.spacegoat.nmtp.items.tools.FlintPickaxe;
import net.spacegoat.nmtp.items.tools.FlintTool;

public class ModTools {
    public static ToolItem FLINT_SHOVEL = new ShovelItem(FlintTool.INSTANCE, 0.5f, -3,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_AXE = new FlintAxe(FlintTool.INSTANCE, 5, -3.3f,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_PICKAXE = new FlintPickaxe(FlintTool.INSTANCE, 0, -2.8f,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_HOE = new FlintHoe(FlintTool.INSTANCE, 0, -3,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_SWORD = registerSwordItem("flint_sword", new SwordItem(
            FlintTool.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.COMBAT)));

    public static ToolItem FLINT_KNIFE = registerSwordItem("flint_knife", new SwordItem(FlintTool.INSTANCE
            , 0, -2.3F, new Item.Settings().group(ItemGroup.TOOLS)));
    public static ToolItem WOODEN_KNIFE = registerSwordItem("wooden_knife", new SwordItem(ToolMaterials
            .WOOD, 1, -2.3F, new Item.Settings().group(ItemGroup.TOOLS)));
    public static final ToolItem GOLDEN_KNIFE = registerSwordItem("golden_knife",
            new SwordItem(ToolMaterials.GOLD, 1, -2.2F,
                    new Item.Settings().group(ItemGroup.TOOLS)));
    public static ToolItem STONE_KNIFE = registerSwordItem("stone_knife", new SwordItem(ToolMaterials
            .STONE, 1, -2.3F, new Item.Settings().group(ItemGroup.TOOLS)));
    public static ToolItem IRON_KNIFE = registerSwordItem("iron_knife", new SwordItem(
            ToolMaterials.IRON, 1, -2.3F, new Item.Settings().group(ItemGroup.TOOLS)));
    public static ToolItem DIAMOND_KNIFE = registerSwordItem("diamond_knife", new SwordItem(
            ToolMaterials.DIAMOND, 1, -2.3F, new Item.Settings().group(ItemGroup.TOOLS)));
    public static final ToolItem NETHERITE_KNIFE = registerSwordItem("netherite_knife",
            new SwordItem(ToolMaterials.NETHERITE, 1, -2.3F,
            new Item.Settings().group(ItemGroup.TOOLS)));

    private static ToolItem registerSwordItem(String name, SwordItem swordItem){
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), swordItem);
    }
    public static void registerModTools(){
        System.out.println("Registering tool items for"+Main.MOD_ID);
    }
}
