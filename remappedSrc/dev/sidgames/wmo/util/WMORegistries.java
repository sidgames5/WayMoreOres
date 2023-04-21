package dev.sidgames.wmo.util;

import dev.sidgames.wmo.item.ModItems;
import dev.sidgames.wmo.Reference;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class WMORegistries {
    public static void registerModStuffs() {
        registerFuels();
    }



    private static void registerFuels() {
        Reference.LOGGER.info("Registering fuels...");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.URANIUM_ROD, 800);
    }
}
