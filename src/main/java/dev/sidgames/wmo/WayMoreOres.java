package dev.sidgames.wmo;

import dev.sidgames.wmo.block.Blocks;
import dev.sidgames.wmo.item.Items;
import dev.sidgames.wmo.util.WMORegistries;
import dev.sidgames.wmo.world.feature.WMOConfiguredFeaturesHelper;
import dev.sidgames.wmo.world.gen.WMOWorldGen;
import net.fabricmc.api.ModInitializer;

public class WayMoreOres implements ModInitializer {
	@Override
	public void onInitialize() {
		Items.registerItems();
		Blocks.registerBlocks();
		WMORegistries.registerModStuffs();
		WMOConfiguredFeaturesHelper.registerConfiguredFeatures();
		WMOWorldGen.generateModWorldGen();
	}
}
