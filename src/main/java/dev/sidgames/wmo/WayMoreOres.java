package dev.sidgames.wmo;

import dev.sidgames.nulacore.feature.updater.InstalledMods;
import dev.sidgames.wmo.block.ModBlocks;
import dev.sidgames.wmo.effect.ModEffects;
import dev.sidgames.wmo.item.ModItems;
import dev.sidgames.wmo.util.WMORegistries;
import dev.sidgames.wmo.world.feature.WMOConfiguredFeaturesHelper;
import dev.sidgames.wmo.world.gen.WMOWorldGenHelper;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.sidgames.wmo.Reference.MOD;

public class WayMoreOres implements ModInitializer {
	private static final Logger logger = LoggerFactory.getLogger(WayMoreOres.class);

	@Override
	public void onInitialize() {
		logger.info("Initializing " + MOD.getName() + " " + MOD.getVersion());
		InstalledMods.register(MOD);
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		WMORegistries.registerModStuffs();
		WMOConfiguredFeaturesHelper.registerConfiguredFeatures();
		WMOWorldGenHelper.generateModWorldGen();
		ModEffects.registerEffects();
	}
}
