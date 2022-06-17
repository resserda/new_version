package resserda.resser.resser_item.weapon.base;


//import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import resserda.resser.resser_item.init.ModItems;

public class CustomToolMaterial implements ToolMaterial{

    public static final CustomToolMaterial INSTANCE = new CustomToolMaterial();


   
    @Override
    public int getDurability() {
        
        return 300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        
        return 2.5F;
    }

    @Override
    public int getMiningLevel() {
        
        return 0;
    }

    @Override
    public int getEnchantability() {
        
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(ModItems.SOUL_INGOT);
    }
    
}