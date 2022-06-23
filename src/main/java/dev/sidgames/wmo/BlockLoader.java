package dev.sidgames.wmo;

import dev.sidgames.wmo.block.AluminumBlock;
import dev.sidgames.wmo.block.BauxiteOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockLoader {
        public static void registerBlocks() {
                // Register blocks here
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "aluminum_block"),
                                new AluminumBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "bauxite_ore"),
                                new BauxiteOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "copper_block"),
                                new CopperBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "copper_ore"),
                                new CopperOre());

                registerBlockItems();
        }

        public static void registerBlockItems() {
                // Register block items here
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_block"),
                                new BlockItem(new AluminumBlock(),
                                                new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bauxite_ore"),
                                new BlockItem(new BauxiteOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "copper_block"),
                                new BlockItem(new CopperBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "copper_ore"),
                                new BlockItem(new CopperOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        }
}
