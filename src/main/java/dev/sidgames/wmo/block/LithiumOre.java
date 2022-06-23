package dev.sidgames.wmo.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class LithiumOre extends BlockBase {
    public LithiumOre() {
        super(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F));
    }
}

