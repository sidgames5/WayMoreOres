package dev.sidgames.wmo;

import dev.sidgames.wmo.util.WMORegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WayMoreOres implements ModInitializer {
	@Override
	public void onInitialize() {
		ItemLoader.registerItems();
		BlockLoader.registerBlocks();
		WMORegistries.registerModStuffs();
	}
}
