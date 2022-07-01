package dev.sidgames.wmo.block;

import dev.sidgames.wmo.ReferenceConstants;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    public static Block ALUMINUM_BLOCK;
    public static Block BAUXITE_ORE;
    public static Block BRONZE_BLOCK;
    public static Block ENDERITE_ORE;
    public static Block ENDERITE_BLOCK;
    public static Block LEAD_BLOCK;
    public static Block LEAD_ORE;
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

    public static Block DEEPSLATE_BAUXITE_ORE;
    public static Block DEEPSLATE_LEAD_ORE;
    public static Block DEEPSLATE_LITHIUM_ORE;
    public static Block DEEPSLATE_PLATINUM_ORE;
    public static Block DEEPSLATE_RUBY_ORE;
    public static Block DEEPSLATE_SILVER_ORE;
    public static Block DEEPSLATE_TIN_ORE;
    public static Block DEEPSLATE_SAPPHIRE_ORE;
    public static Block DEEPSLATE_URANIUM_ORE;

    public static void registerBlocks() {
        // Register blocks here
        ALUMINUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "aluminum_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        BAUXITE_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "bauxite_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        BRONZE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "bronze_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        ENDERITE_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "enderite_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        ENDERITE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "enderite_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        LEAD_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "lead_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        LEAD_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "lead_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        LITHIUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "lithium_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        LITHIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "lithium_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        PLATINUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "platinum_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        PLATINUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "platinum_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        RUBY_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "ruby_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        RUBY_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "ruby_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        SAPPHIRE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "sapphire_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        SAPPHIRE_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "sapphire_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        SILVER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "silver_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        SILVER_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "silver_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        TIN_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "tin_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        TIN_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "tin_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        URANIUM_BLOCK = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "uranium_block"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        URANIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "uranium_ore"), new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F).requiresTool()));
        DEEPSLATE_BAUXITE_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_bauxite_ore"), new Block(FabricBlockSettings.copy(Blocks.BAUXITE_ORE)));
        DEEPSLATE_LEAD_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_lead_ore"), new Block(FabricBlockSettings.copy(Blocks.LEAD_ORE)));
        DEEPSLATE_LITHIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_lithium_ore"), new Block(FabricBlockSettings.copy(Blocks.LITHIUM_ORE)));
        DEEPSLATE_PLATINUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_platinum_ore"), new Block(FabricBlockSettings.copy(Blocks.PLATINUM_ORE)));
        DEEPSLATE_RUBY_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_ruby_ore"), new Block(FabricBlockSettings.copy(Blocks.RUBY_ORE)));
        DEEPSLATE_SAPPHIRE_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_sapphire_ore"), new Block(FabricBlockSettings.copy(Blocks.SAPPHIRE_ORE)));
        DEEPSLATE_SILVER_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_silver_ore"), new Block(FabricBlockSettings.copy(Blocks.SILVER_ORE)));
        DEEPSLATE_TIN_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_tin_ore"), new Block(FabricBlockSettings.copy(Blocks.TIN_ORE)));
        DEEPSLATE_URANIUM_ORE = Registry.register(Registry.BLOCK, new Identifier(ReferenceConstants.MOD_ID, "deepslate_uranium_ore"), new Block(FabricBlockSettings.copy(Blocks.URANIUM_ORE)));

        registerBlockItems();
    }

    public static void registerBlockItems() {
        // Register block items here
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bauxite_ore"), new BlockItem(BAUXITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_block"), new BlockItem(BRONZE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "enderite_ore"), new BlockItem(ENDERITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "enderite_block"), new BlockItem(ENDERITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_block"), new BlockItem(LEAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_ore"), new BlockItem(LEAD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_block"), new BlockItem(LITHIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_ore"), new BlockItem(LITHIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_block"), new BlockItem(PLATINUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_ore"), new BlockItem(PLATINUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_block"), new BlockItem(TIN_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "uranium_block"), new BlockItem(URANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_bauxite_ore"), new BlockItem(DEEPSLATE_BAUXITE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_lead_ore"), new BlockItem(DEEPSLATE_LEAD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_lithium_ore"), new BlockItem(DEEPSLATE_LITHIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_platinum_ore"), new BlockItem(DEEPSLATE_PLATINUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_sapphire_ore"), new BlockItem(DEEPSLATE_SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_tin_ore"), new BlockItem(DEEPSLATE_TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "deepslate_uranium_ore"), new BlockItem(DEEPSLATE_URANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
