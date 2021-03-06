package resserda.resser.resser_item.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import resserda.resser.resser_item.ResserItem;
import resserda.resser.resser_item.item.NoNamedSoul;
import resserda.resser.resser_item.item.ResserPickAxe;
import resserda.resser.resser_item.item.SoulIngot;
import resserda.resser.resser_item.item.base.CustomArmorMaterial;
import resserda.resser.resser_item.weapon.ShortSword;
import resserda.resser.resser_item.weapon.base.CustomToolMaterial;
import resserda.resser.resser_item.weapon.base.Pickaxebase;


public class ModItems {

    public static final ItemGroup MOD_GROUP = FabricItemGroupBuilder.build(new Identifier(ResserItem.MOD_ID, "general"), () -> new ItemStack(Items.APPLE));
    public static final Item NO_NAMED_SOUL = new NoNamedSoul(new Item.Settings().group(MOD_GROUP));
    public static final ToolItem SHORT_SWORD = new ShortSword(CustomToolMaterial.INSTANCE, 5, 1.0f, new Item.Settings().group(MOD_GROUP));
    public static final ToolItem RESSER_PICKAXE = new ResserPickAxe(Pickaxebase.INSTANCE,1,-2.6f,new Item.Settings().group(MOD_GROUP));
    public static final Item SOUL_INGOT= new SoulIngot(new Item.Settings().group(MOD_GROUP));
    public static final Item RESSER_HELMET = new ArmorItem(CustomArmorMaterial.RESSER, EquipmentSlot.HEAD, new Item.Settings().group(MOD_GROUP));
    public static final Item RESSER_CHESTPLATE = new ArmorItem(CustomArmorMaterial.RESSER, EquipmentSlot.CHEST, new Item.Settings().group(MOD_GROUP));
    public static final Item RESSER_LEGGINGS = new ArmorItem(CustomArmorMaterial.RESSER, EquipmentSlot.LEGS, new Item.Settings().group(MOD_GROUP));
    public static final Item RESSER_BOOTS = new ArmorItem(CustomArmorMaterial.RESSER,EquipmentSlot.FEET,  new Item.Settings().group(MOD_GROUP));
    public ModItems(ToolMaterial material, int i, float f, Settings settings) {
    }

    public static void init() {
    //Items & etc...
	Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "no_named_soul"), NO_NAMED_SOUL);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "short_sword"),SHORT_SWORD);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "resser_pickaxe"),RESSER_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "soul_ingot"),SOUL_INGOT);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID,"resser_helmet"),RESSER_HELMET);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID,"resser_chestplate"),RESSER_CHESTPLATE);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID,"resser_leggings"),RESSER_LEGGINGS);
    Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID,"resser_boots"),RESSER_BOOTS);

	
    }



}
