package dev.sidgames.wmo.item;

import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.item.functional.LeadIngot;
import dev.sidgames.wmo.item.tool.WMOAxeItem;
import dev.sidgames.wmo.item.tool.WMOHoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item ALUMINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BRONZE_ALLOY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LEAD_INGOT = new LeadIngot(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LITHIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item URANIUM_ROD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));


    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_alloy"), BRONZE_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ingot"), LITHIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby"), RUBY_GEM);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire"), SAPPHIRE_GEM);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_rod"), URANIUM_ROD);

        // Register tool items here
        /// Axes
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_axe"), new WMOAxeItem(WMOToolMaterials.ALUMINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_axe"), new WMOAxeItem(WMOToolMaterials.BRONZE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_axe"), new WMOAxeItem(WMOToolMaterials.LEAD, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_axe"), new WMOAxeItem(WMOToolMaterials.LITHIUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_axe"), new WMOAxeItem(WMOToolMaterials.PLATINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_axe"), new WMOAxeItem(WMOToolMaterials.RUBY, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_axe"), new WMOAxeItem(WMOToolMaterials.SAPPHIRE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_axe"), new WMOAxeItem(WMOToolMaterials.SILVER, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_axe"), new WMOAxeItem(WMOToolMaterials.TIN, 1, 2f));
        /// Hoes
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_hoe"), new WMOHoeItem(WMOToolMaterials.ALUMINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_hoe"), new WMOHoeItem(WMOToolMaterials.BRONZE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_hoe"), new WMOHoeItem(WMOToolMaterials.LEAD, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_hoe"), new WMOHoeItem(WMOToolMaterials.LITHIUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_hoe"), new WMOHoeItem(WMOToolMaterials.PLATINUM, 1, 2f));
    }

}
