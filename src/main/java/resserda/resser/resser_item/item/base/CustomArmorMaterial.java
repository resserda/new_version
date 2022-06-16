package resserda.resser.resser_item.item.base;

import com.google.common.base.Supplier;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import resserda.resser.resser_item.init.ModItems;

public enum CustomArmorMaterial implements ArmorMaterial {

    RESSER("resser_item", 15, new int[]{4,6,7,3},15,SoundEvents.BLOCK_WOOL_PLACE,1.0F, () -> {
        return Ingredient.ofItems(ModItems.SOUL_INGOT);
    },0.2F);

    private static final int[] BASEDURABILITY= new int[] {13,15,16,11}; 
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredientSupplier;
    private final float KnockbackResistance;

    CustomArmorMaterial(String name,int durabilityMultiplier , int[] armorValueArr,int enchantability,SoundEvent soundEvent,float toughness,Supplier<Ingredient> repairIngredient,float knockbackresistance){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = armorValueArr;
        this.enchantability = enchantability;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.repairIngredientSupplier = new Lazy(repairIngredient);
        this.KnockbackResistance = knockbackresistance;
    }



    @Override
    public int getDurability(EquipmentSlot equipmentSlot_1) {
        
        return BASEDURABILITY[equipmentSlot_1.getEntitySlotId()]*this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
      
        return this.protectionAmounts[equipmentSlot_1.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
       
        return this.name;
    }

    @Override
    public float getToughness() {
       
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        
        return this.KnockbackResistance;
    }
    
}
