package dev.sidgames.wmo;

import dev.sidgames.nulacore.util.ModConfig;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reference {
    public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);

    public static final String MOD_ID = "wmo";
    public static final ModConfig MOD = new Mod();

    private static class Mod implements ModConfig {
        @Override
        public String getName() {
            return "WayMoreOres";
        }

        @Override
        public String getId() {
            return Reference.MOD_ID;
        }

        @Override
        public String getVersion() {
            return FabricLoader.getInstance().getModContainer(getId()).get().getMetadata().getVersion().getFriendlyString();
        }

        @Override
        public String getMcVersion() {
            return "1.19.2";
        }

        @Override
        public String getModrinthId() {
            return "waymoreores";
        }
    }
}
