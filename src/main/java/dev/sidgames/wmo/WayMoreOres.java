package dev.sidgames.wmo;

import dev.sidgames.wmo.util.WMORegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WayMoreOres implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);

	@Override
	public void onInitialize() {

		ItemLoader.registerItems();
		BlockLoader.registerBlocks();
		WMORegistries.registerModStuffs();
	}
}
