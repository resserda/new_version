package resserda.resser.resser_item.weapon.base;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;



public class Swordbase extends SwordItem {

    public Swordbase(ToolMaterial material,int attackDamage, float attackSpeed, Settings settings) {
        super(material,7, 2.0f, settings);
        
    }
    
}
