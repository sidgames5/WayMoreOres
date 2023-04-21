package dev.sidgames.wmo.world.feature;

import dev.sidgames.wmo.block.ModBlocks;
import dev.sidgames.wmo.Reference;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class WMOConfiguredFeaturesHelper {
    public static final List<OreFeatureConfig.Target> OVERWORLD_BAUXITE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BAUXITE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BAUXITE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_LEAD_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LEAD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_LITHIUM_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LITHIUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LITHIUM_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_PLATINUM_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_URANIUM_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.URANIUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_COBALT_ORES =  List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.COBALT_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_ENDERITE_ORES = List.of(OreFeatureConfig.createTarget(new BlockMatchRuleTest(net.minecraft.block.Blocks.END_STONE), ModBlocks.ENDERITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BAUXITE_ORE = ConfiguredFeatures.register("bauxite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_BAUXITE_ORES, 2));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ENDERITE_ORE = ConfiguredFeatures.register("enderite_ore", Feature.ORE, new OreFeatureConfig(END_ENDERITE_ORES, 1));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE = ConfiguredFeatures.register("lead_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_LEAD_ORES, 5));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LITHIUM_ORE = ConfiguredFeatures.register("lithium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_LITHIUM_ORES, 1));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINUM_ORE = ConfiguredFeatures.register("platinum_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_PLATINUM_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE = ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RUBY_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE = ConfiguredFeatures.register("sapphire_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE = ConfiguredFeatures.register("silver_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SILVER_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE = ConfiguredFeatures.register("tin_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TIN_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> URANIUM_ORE = ConfiguredFeatures.register("uranium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_URANIUM_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COBALT_ORE = ConfiguredFeatures.register("cobalt_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_COBALT_ORES, 8));

    public static void registerConfiguredFeatures() {
        Reference.LOGGER.info("Registering configured features");
    }
}
