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
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "lithium_block"),
                                new LithiumBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "lithium_ore"),
                                new LithiumOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "platinum_block"),
                                new PlatinumBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "platinum_ore"),
                                new PlatinumOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "ruby_block"),
                                new RubyBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "ruby_ore"),
                                new RubyOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "sapphire_block"),
                                new SapphireBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "sapphire_ore"),
                                new SapphireOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "silver_block"),
                                new SilverBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "silver_ore"),
                                new SilverOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "tin_block"),
                                new TinBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "tin_ore"),
                                new TinOre());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "uranium_block"),
                                new UraniumBlock());
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, "uranium_ore"),
                                new UraniumOre());

                registerBlockItems();
        }

        public static void registerBlockItems() {
                // Register block items here
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_block"),
                                new BlockItem(new AluminumBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bauxite_ore"),
                                new BlockItem(new BauxiteOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "copper_block"),
                                new BlockItem(new CopperBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "copper_ore"),
                                new BlockItem(new CopperOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_block"),
                                new BlockItem(new LithiumBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ore"),
                                new BlockItem(new LithiumOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_block"),
                                new BlockItem(new PlatinumBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ore"),
                                new BlockItem(new PlatinumOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_block"),
                                new BlockItem(new RubyBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_ore"),
                                new BlockItem(new RubyOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_block"),
                                new BlockItem(new SapphireBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_ore"),
                                new BlockItem(new SapphireOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_block"),
                                new BlockItem(new SilverBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ore"),
                                new BlockItem(new SilverOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_block"),
                                new BlockItem(new TinBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ore"),
                                new BlockItem(new TinOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_block"),
                                new BlockItem(new UraniumBlock(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ore"),
                                new BlockItem(new UraniumOre(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        }
}
