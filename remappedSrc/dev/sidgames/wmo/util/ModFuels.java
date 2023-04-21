package dev.sidgames.wmo.util;

import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuels {
    public static void registerFuels() {
        Reference.LOGGER.info("Registering fuels...");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.URANIUM_ROD, 800);
    }
}
