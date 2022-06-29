package dev.sidgames.wmo.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class WMOPlacedFeaturesConstants {
    public static final RegistryEntry<PlacedFeature> BAUXITE_ORE_PLACED = PlacedFeatures.register("bauxite_ore_placed", WMOConfiguredFeaturesHelper.BAUXITE_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> LEAD_ORE_PLACED = PlacedFeatures.register("lead_ore_placed", WMOConfiguredFeaturesHelper.LEAD_ORE, WMOOreFeaturesHelper.modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(255))));
    public static final RegistryEntry<PlacedFeature> LITHIUM_ORE_PLACED = PlacedFeatures.register("lithium_ore_placed", WMOConfiguredFeaturesHelper.LITHIUM_ORE, WMOOreFeaturesHelper.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(32))));
    public static final RegistryEntry<PlacedFeature> PLATINUM_ORE_PLACED = PlacedFeatures.register("platinum_ore_placed", WMOConfiguredFeaturesHelper.PLATINUM_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed", WMOConfiguredFeaturesHelper.RUBY_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacedFeatures.register("sapphire_ore_placed", WMOConfiguredFeaturesHelper.SAPPHIRE_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed", WMOConfiguredFeaturesHelper.SILVER_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> TIN_ORE_PLACED = PlacedFeatures.register("tin_ore_placed", WMOConfiguredFeaturesHelper.TIN_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> URANIUM_ORE_PLACED = PlacedFeatures.register("uranium_ore_placed", WMOConfiguredFeaturesHelper.URANIUM_ORE, WMOOreFeaturesHelper.modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
}
