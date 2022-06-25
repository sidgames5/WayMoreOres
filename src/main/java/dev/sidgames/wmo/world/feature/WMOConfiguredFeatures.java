package dev.sidgames.wmo.world.feature;

import dev.sidgames.wmo.BlockLoader;
import dev.sidgames.wmo.Reference;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class WMOConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_BAUXITE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BlockLoader.BAUXITE_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BAUXITE_ORE = ConfiguredFeatures.register("bauxite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_BAUXITE_ORES, 9));

    public static void registerConfiguredFeatures() {
        Reference.LOGGER.info("Registering configured features");
    }
}