package dev.sidgames.wmo;

import net.fabricmc.api.ClientModInitializer;

public class WMOClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ReferenceConstants.LOGGER.info("WMOClient is loading...");
    }
}
