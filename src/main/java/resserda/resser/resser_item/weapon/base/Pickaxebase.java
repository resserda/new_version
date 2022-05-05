package resserda.resser.resser_item.weapon.base;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class Pickaxebase extends PickaxeItem{

    public Pickaxebase(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, 1, -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
        
    }
    
}
