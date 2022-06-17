package resserda.resser.resser_item.init;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import resserda.resser.resser_item.ResserItem;
import resserda.resser.resser_item.block.soul_ore;

public class ModBlocks {

    public static final soul_ore SOUL_ORE = new soul_ore(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(3.0f, 3.0f));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(ResserItem.MOD_ID, "soul_ore"), SOUL_ORE);
        Registry.register(Registry.ITEM, new Identifier(ResserItem.MOD_ID, "soul_ore"), new BlockItem(SOUL_ORE, new FabricItemSettings().group(ModItems.MOD_GROUP)));
    }    
}
