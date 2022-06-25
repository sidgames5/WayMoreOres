package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslateUraniumOre extends BlockBase {
    public DeepslateUraniumOre() {
        super(FabricBlockSettings.copy(BlockLoader.URANIUM_ORE));
    }

}
