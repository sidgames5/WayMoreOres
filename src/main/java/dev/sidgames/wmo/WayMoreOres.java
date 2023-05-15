package dev.sidgames.wmo;

import dev.sidgames.wmo.block.ModBlocks;
import dev.sidgames.wmo.effect.ModEffects;
import dev.sidgames.wmo.item.ModItems;
import dev.sidgames.wmo.util.WMORegistries;
import dev.sidgames.wmo.world.feature.WMOConfiguredFeaturesHelper;
import dev.sidgames.wmo.world.gen.WMOWorldGenHelper;
import net.fabricmc.api.ModInitializer;

public class WayMoreOres implements ModInitializer {
	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		WMORegistries.registerModStuffs();
		WMOConfiguredFeaturesHelper.registerConfiguredFeatures();
		WMOWorldGenHelper.generateModWorldGen();
		ModEffects.registerEffects();
	}
}
