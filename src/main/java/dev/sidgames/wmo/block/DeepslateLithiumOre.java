package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslateLithiumOre extends BlockBase {
    public DeepslateLithiumOre() {
        super(FabricBlockSettings.copy(BlockLoader.LITHIUM_ORE));
    }

}
