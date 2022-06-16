package resserda.resser.resser_item.weapon;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AirBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import resserda.resser.resser_item.weapon.base.CustomToolMaterial;

public class ShortSword extends SwordItem {

    public ShortSword(CustomToolMaterial material,int attackDamage, float attackSpeed, Settings settings) {
        super(material,3, -2.3f, settings);
        
    }
    public TypedActionResult<ItemStack> use(World wold, PlayerEntity player,Hand hand){



        return TypedActionResult.pass(null);
    }

    
    
}
