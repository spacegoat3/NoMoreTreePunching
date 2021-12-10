package net.spacegoat.nmtp.items;

import net.minecraft.item.*;
import net.spacegoat.nmtp.items.tools.FlintAxe;
import net.spacegoat.nmtp.items.tools.FlintHoe;
import net.spacegoat.nmtp.items.tools.FlintPickaxe;
import net.spacegoat.nmtp.items.tools.FlintTool;

public class ModTools {
    public static ToolItem FLINT_AXE = new FlintAxe(FlintTool.INSTANCE, 6, 0.7f,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_PICKAXE = new FlintPickaxe(FlintTool.INSTANCE, 1, 1.2f,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_HOE = new FlintHoe(FlintTool.INSTANCE, 1, 1,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_SHOVEL = new ShovelItem(FlintTool.INSTANCE, 2, 1,
            new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem FLINT_SWORD = new SwordItem(FlintTool.INSTANCE, 3, 1.6f,
            new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem FLINT_KNIFE = new SwordItem(FlintTool.INSTANCE, 2, 1.8f,
            new Item.Settings().group(ItemGroup.TOOLS));
}
