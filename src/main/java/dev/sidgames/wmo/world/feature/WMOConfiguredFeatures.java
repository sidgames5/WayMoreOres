package dev.sidgames.wmo.world.feature;

import dev.sidgames.wmo.BlockLoader;
import dev.sidgames.wmo.Reference;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class WMOConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_BAUXITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.BAUXITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_BAUXITE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_LEAD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.LEAD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_LEAD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_LITHIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.LITHIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_LITHIUM_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_PLATINUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.PLATINUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_PLATINUM_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_RUBY_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    BlockLoader.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlockLoader.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BAUXITE_ORE = ConfiguredFeatures.register("bauxite_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_BAUXITE_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE = ConfiguredFeatures.register("lead_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_LEAD_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LITHIUM_ORE = ConfiguredFeatures.register("lithium_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_LITHIUM_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINUM_ORE = ConfiguredFeatures.register("platinum_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_PLATINUM_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE = ConfiguredFeatures.register("ruby_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_RUBY_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE = ConfiguredFeatures.register("sapphire_ore", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 9));

    public static void registerConfiguredFeatures() {
        Reference.LOGGER.info("Registering configured features");
    }
}
