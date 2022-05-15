package resserda.resser.resser_item.weapon.base;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Pickaxebase implements ToolMaterial{

    public static final Pickaxebase INSTANCE= new Pickaxebase();

    @Override
    public int getDurability() {
        
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
       
        return 4.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_PICKAXE);
    }

    
}
