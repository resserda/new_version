package resserda.resser.resser_item.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import resserda.resser.resser_item.ResserItem;
import resserda.resser.resser_item.item.NoNamedSoul;
import resserda.resser.resser_item.weapon.ShortSword;
import resserda.resser.resser_item.weapon.base.CustomToolMaterial;
import resserda.resser.resser_item.weapon.base.Pickaxebase;

public class ModItems {


    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(new Identifier(ResserItem.MOD_ID, "general"), () -> new ItemStack(Items.APPLE));
    public static final Item NO_NAMED_SOUL = new NoNamedSoul(new Item.Settings().group(MOD_GROUP));
    public static final ToolItem SHORT_SWORD = new ShortSword(CustomToolMaterial.INSTANCE, 5, 1.0f, new Item.Settings().group(MOD_GROUP));

    public static void init() {
    //Items & etc...
	Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "no_named_soul"), NO_NAMED_SOUL);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "short_sword"),SHORT_SWORD);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "resser_pickaxe"), new Pickaxebase(CustomToolMaterial.INSTANCE, 1, -2.0f, new Item.Settings().group(MOD_GROUP)));
	
    }



}
