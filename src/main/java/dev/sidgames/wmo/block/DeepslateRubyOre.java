package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslateRubyOre extends BlockBase {
    public DeepslateRubyOre() {
        super(FabricBlockSettings.copy(BlockLoader.RUBY_ORE));
    }
}
