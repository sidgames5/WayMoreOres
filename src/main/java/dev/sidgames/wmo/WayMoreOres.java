package dev.sidgames.wmo;

import dev.sidgames.wmo.util.WMORegistries;
import dev.sidgames.wmo.world.feature.WMOConfiguredFeatures;
import dev.sidgames.wmo.world.gen.WMOWorldGen;
import net.fabricmc.api.ModInitializer;

public class WayMoreOres implements ModInitializer {
	@Override
	public void onInitialize() {
		ItemLoader.registerItems();
		BlockLoader.registerBlocks();
		WMORegistries.registerModStuffs();
		WMOConfiguredFeatures.registerConfiguredFeatures();
		WMOWorldGen.generateModWorldGen();
	}
}
