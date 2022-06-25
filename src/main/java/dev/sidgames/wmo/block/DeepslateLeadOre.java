package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class DeepslateLeadOre extends BlockBase {
    public DeepslateLeadOre() {
        super(FabricBlockSettings.copy(BlockLoader.LEAD_ORE));
    }

}
