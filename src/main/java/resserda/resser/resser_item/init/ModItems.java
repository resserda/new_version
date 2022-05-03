package resserda.resser.resser_item.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import resserda.resser.resser_item.ResserItem;
import resserda.resser.resser_item.item.ItemTest;

public class ModItems {


    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(new Identifier(ResserItem.MOD_ID, "general"), () -> new ItemStack(Items.APPLE));
    public static final Item TEST_ITEM = new ItemTest(new Item.Settings().group(MOD_GROUP));
    public static void init() {
    //Items & etc...
	Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "test_item"), TEST_ITEM);
	
    }



}
