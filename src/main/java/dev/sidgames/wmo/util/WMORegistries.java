package dev.sidgames.wmo.util;

import dev.sidgames.wmo.ItemLoader;
import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.WayMoreOres;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class WMORegistries {
    public static void registerModStuffs() {
        registerFuels();
    }



    private static void registerFuels() {
        Reference.LOGGER.info("Registering fuels...");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ItemLoader.URANIUM_ROD, 800);
    }
}
