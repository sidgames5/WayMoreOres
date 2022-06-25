package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class DeepslateBauxiteOre extends BlockBase {
    public DeepslateBauxiteOre() {
        super(FabricBlockSettings.copy(BlockLoader.BAUXITE_ORE));
    }

}
