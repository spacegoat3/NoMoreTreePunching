package net.spacegoat.nmtp.items.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FlintTool implements ToolMaterial {

    public static final FlintTool INSTANCE = new FlintTool();

    @Override
    public int getDurability(){
        return 40;
    }
    public float getMiningSpeedMultiplier(){
        return 1.5f;
    }
    public float getAttackDamage(){
        return 0;
    }
    public int getMiningLevel(){
        return 0;
    }
    public int getEnchantability(){
        return 2;
    }
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(Items.FLINT);
    }
}
