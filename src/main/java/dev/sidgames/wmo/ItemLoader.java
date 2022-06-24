package dev.sidgames.wmo;

import dev.sidgames.wmo.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemLoader {
    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_ingot"), new AluminumIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_nugget"), new AluminumNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_alloy"), new BronzeAlloy(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_ingot"), new LeadIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_nugget"), new LeadNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ingot"), new LithiumIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_nugget"), new LithiumNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ingot"), new PlatinumIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_nugget"), new PlatinumNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby"), new RubyGem(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire"), new SapphireGem(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ingot"), new SilverIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_nugget"), new SilverNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ingot"), new TinIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_nugget"), new TinNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ingot"), new UraniumIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_nugget"), new UraniumNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_rod"), new UraniumRod(new Item.Settings().group(ItemGroup.MATERIALS)));
    }

}
