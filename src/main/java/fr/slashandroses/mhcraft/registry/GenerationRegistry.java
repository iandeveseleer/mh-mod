package fr.slashandroses.mhcraft.registry;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static fr.slashandroses.mhcraft.MHCraft.registerOreGenerationFeature;

public class GenerationRegistry {
    public static final ConfiguredFeature<?, ?> SCHIST_GENERATION = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    BlockRegistry.SCHIST_BLOCK.getDefaultState(),
                    20)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    15, // bottom offset
                    0, // min y level
                    120))) // max y level
            .spreadHorizontally()
            .repeat(15); // number of veins per chunk


    public static void init() {
        registerOreGenerationFeature("schist_overworld", SCHIST_GENERATION);
    }
}
