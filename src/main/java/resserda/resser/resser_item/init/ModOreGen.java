package resserda.resser.resser_item.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import resserda.resser.resser_item.ResserItem;

public class ModOreGen {

    private static ConfiguredFeature<?, ?> ORE_SOUL = Feature.ORE
    .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.STONE), ModBlocks.SOUL_ORE.getDefaultState(), 7))
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(10, 0, 40)))
    .spreadHorizontally()
    .repeat(10);

    public static void init() {
        RegistryKey<ConfiguredFeature<?, ?>> oreSoul = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
        new Identifier(ResserItem.MOD_ID, "ore_soul"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSoul.getValue(), ORE_SOUL);
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.TAIGA), GenerationStep.Feature.UNDERGROUND_ORES, oreSoul);
    }
}
    

