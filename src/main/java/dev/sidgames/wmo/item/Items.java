package dev.sidgames.wmo.item;

import dev.sidgames.wmo.ReferenceConstants;
import dev.sidgames.wmo.item.functional.LeadIngot;
import dev.sidgames.wmo.item.tool.WMOAxeItem;
import dev.sidgames.wmo.item.tool.WMOHoeItem;
import dev.sidgames.wmo.item.tool.WMOPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    public static final Item ALUMINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BRONZE_ALLOY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LEAD_INGOT = new LeadIngot(new FabricItemSettings().group(ItemGroup.MATERIALS).food(WMOFoodComponents.LEAD_INGOT));
    public static final Item LITHIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item URANIUM_ROD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));


    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_alloy"), BRONZE_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_ingot"), LITHIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby"), RUBY_GEM);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire"), SAPPHIRE_GEM);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "uranium_ingot"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "uranium_nugget"), new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "uranium_rod"), URANIUM_ROD);

        // Register tool items here
        /// Axes
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_axe"), new WMOAxeItem(WMOToolMaterials.ALUMINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_axe"), new WMOAxeItem(WMOToolMaterials.BRONZE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_axe"), new WMOAxeItem(WMOToolMaterials.LEAD, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_axe"), new WMOAxeItem(WMOToolMaterials.LITHIUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_axe"), new WMOAxeItem(WMOToolMaterials.PLATINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_axe"), new WMOAxeItem(WMOToolMaterials.RUBY, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_axe"), new WMOAxeItem(WMOToolMaterials.SAPPHIRE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_axe"), new WMOAxeItem(WMOToolMaterials.SILVER, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_axe"), new WMOAxeItem(WMOToolMaterials.TIN, 1, 2f));
        /// Hoes
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_hoe"), new WMOHoeItem(WMOToolMaterials.ALUMINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_hoe"), new WMOHoeItem(WMOToolMaterials.BRONZE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_hoe"), new WMOHoeItem(WMOToolMaterials.LEAD, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_hoe"), new WMOHoeItem(WMOToolMaterials.LITHIUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_hoe"), new WMOHoeItem(WMOToolMaterials.PLATINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_hoe"), new WMOHoeItem(WMOToolMaterials.RUBY, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_hoe"), new WMOHoeItem(WMOToolMaterials.SAPPHIRE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_hoe"), new WMOHoeItem(WMOToolMaterials.SILVER, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_hoe"), new WMOHoeItem(WMOToolMaterials.TIN, 1, 2f));
        /// Pickaxes
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.ALUMINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.BRONZE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.LEAD, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.LITHIUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.PLATINUM, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.RUBY, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.SAPPHIRE, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.SILVER, 1, 2f));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.TIN, 1, 2f));
        /// Shovels
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_shovel"), new ShovelItem(WMOToolMaterials.ALUMINUM, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_shovel"), new ShovelItem(WMOToolMaterials.BRONZE, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_shovel"), new ShovelItem(WMOToolMaterials.LEAD, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_shovel"), new ShovelItem(WMOToolMaterials.LITHIUM, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_shovel"), new ShovelItem(WMOToolMaterials.PLATINUM, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_shovel"), new ShovelItem(WMOToolMaterials.RUBY, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_shovel"), new ShovelItem(WMOToolMaterials.SAPPHIRE, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_shovel"), new ShovelItem(WMOToolMaterials.SILVER, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_shovel"), new ShovelItem(WMOToolMaterials.TIN, 1, 2f, new Item.Settings().group(ItemGroup.TOOLS)));
        /// Swords
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_sword"), new SwordItem(WMOToolMaterials.ALUMINUM, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_sword"), new SwordItem(WMOToolMaterials.BRONZE, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_sword"), new SwordItem(WMOToolMaterials.LEAD, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_sword"), new SwordItem(WMOToolMaterials.LITHIUM, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_sword"), new SwordItem(WMOToolMaterials.PLATINUM, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_sword"), new SwordItem(WMOToolMaterials.RUBY, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_sword"), new SwordItem(WMOToolMaterials.SAPPHIRE, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_sword"), new SwordItem(WMOToolMaterials.SILVER, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_sword"), new SwordItem(WMOToolMaterials.TIN, 1, 2f, new Item.Settings().group(ItemGroup.COMBAT)));

        // Register armor here
        /// Helmets
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_helmet"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_helmet"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_helmet"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_helmet"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_helmet"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_helmet"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_helmet"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_helmet"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_helmet"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        /// Chestplates
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_chestplate"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_chestplate"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_chestplate"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_chestplate"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_chestplate"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_chestplate"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_chestplate"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_chestplate"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_chestplate"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        /// Leggings
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_leggings"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_leggings"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_leggings"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_leggings"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_leggings"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_leggings"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_leggings"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_leggings"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_leggings"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        /// Boots
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "aluminum_boots"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "bronze_boots"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lead_boots"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "lithium_boots"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "platinum_boots"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "ruby_boots"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "sapphire_boots"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "silver_boots"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(ReferenceConstants.MOD_ID, "tin_boots"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
    }

}
