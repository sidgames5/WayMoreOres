package dev.sidgames.wmo.item;

import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.item.functional.LeadIngot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item URANIUM_ROD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_alloy"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_ingot"), new LeadIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_rod"), URANIUM_ROD);
    }

}
