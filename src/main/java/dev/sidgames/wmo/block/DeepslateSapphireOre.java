package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslateSapphireOre extends BlockBase {
    public DeepslateSapphireOre() {
        super(FabricBlockSettings.copy(BlockLoader.SAPPHIRE_ORE));
    }
}

