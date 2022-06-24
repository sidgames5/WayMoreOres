package dev.sidgames.wmo;

import dev.sidgames.wmo.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockLoader {
        public static Block ALUMINUM_BLOCK;
        public static Block BAUXITE_ORE;
        public static Block BRONZE_BLOCK;
        public static Block LITHIUM_BLOCK;
        public static Block LITHIUM_ORE;
        public static Block PLATINUM_BLOCK;
        public static Block PLATINUM_ORE;
        public static Block RUBY_BLOCK;
        public static Block RUBY_ORE;
        public static Block SILVER_BLOCK;
        public static Block SILVER_ORE;
        public static Block TIN_BLOCK;
        public static Block TIN_ORE;
        public static Block SAPPHIRE_BLOCK;
        public static Block SAPPHIRE_ORE;
        public static Block URANIUM_BLOCK;
        public static Block URANIUM_ORE;

        public static void registerBlocks() {
                // Register blocks here
                ALUMINUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "aluminum_block"), new AluminumBlock());
                BAUXITE_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "bauxite_ore"), new BauxiteOre());
                BRONZE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "bronze_block"), new BronzeBlock());
                LITHIUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "lithium_block"), new LithiumBlock());
                LITHIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "lithium_ore"), new LithiumOre());
                PLATINUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "platinum_block"), new PlatinumBlock());
                PLATINUM_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "platinum_ore"), new PlatinumOre());
                RUBY_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "ruby_block"), new RubyBlock());
                RUBY_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "ruby_ore"), new RubyOre());
                SAPPHIRE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "sapphire_block"), new SapphireBlock());
                SAPPHIRE_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "sapphire_ore"), new SapphireOre());
                SILVER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "silver_block"), new SilverBlock());
                SILVER_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "silver_ore"), new SilverOre());
                TIN_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "tin_block"), new TinBlock());
                TIN_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "tin_ore"), new TinOre());
                URANIUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "uranium_block"), new UraniumBlock());
                URANIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "uranium_ore"), new UraniumOre());

                registerBlockItems();
        }

        public static void registerBlockItems() {
                // Register block items here
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bauxite_ore"), new BlockItem(BAUXITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_block"), new BlockItem(BRONZE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_block"), new BlockItem(LITHIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ore"), new BlockItem(LITHIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_block"), new BlockItem(PLATINUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ore"), new BlockItem(PLATINUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_block"), new BlockItem(TIN_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_block"), new BlockItem(URANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        }
}
