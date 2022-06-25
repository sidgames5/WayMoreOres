package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslatePlatinumOre extends BlockBase {
    public DeepslatePlatinumOre() {
        super(FabricBlockSettings.copy(BlockLoader.PLATINUM_ORE));
    }

}
