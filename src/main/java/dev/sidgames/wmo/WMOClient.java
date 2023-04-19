package dev.sidgames.wmo;

import net.fabricmc.api.ClientModInitializer;

public class WMOClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Reference.LOGGER.info("WMOClient is loading...");
    }
}
