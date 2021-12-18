package net.spacegoat.nmtp.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacegoat.nmtp.Main;

public class ModItems {

    public static final Item PLANT_FIBER = registerItem("plant_fiber",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item PLANT_STRING = registerItem("plant_string",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item ROPE = registerItem("rope",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
    public static void registerModItems(){
        System.out.println("Registering items for"+Main.MOD_ID);
    }
}
