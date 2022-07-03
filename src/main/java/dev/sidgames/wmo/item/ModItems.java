package dev.sidgames.wmo.item;

import dev.sidgames.wmo.WayMoreOres;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WayMoreOres.MOD_ID);

    public static RegistryObject<Item> ALUMINUM_INGOT;
    public static RegistryObject<Item> BRONZE_ALLOY;
    public static RegistryObject<Item> LEAD_INGOT;
    public static RegistryObject<Item> LITHIUM_INGOT;
    public static RegistryObject<Item> PLATINUM_INGOT;
    public static RegistryObject<Item> RUBY_GEM;
    public static RegistryObject<Item> SAPPHIRE_GEM;
    public static RegistryObject<Item> SILVER_INGOT;
    public static RegistryObject<Item> TIN_INGOT;
    public static RegistryObject<Item> URANIUM_INGOT;

    public static RegistryObject<Item> ALUMINUM_NUGGET;
    public static RegistryObject<Item> BRONZE_NUGGET;
    public static RegistryObject<Item> LEAD_NUGGET;
    public static RegistryObject<Item> LITHIUM_NUGGET;
    public static RegistryObject<Item> PLATINUM_NUGGET;
    public static RegistryObject<Item> SILVER_NUGGET;
    public static RegistryObject<Item> TIN_NUGGET;
    public static RegistryObject<Item> URANIUM_NUGGET;

    public static RegistryObject<Item> URANIUM_ROD;

    public static void register(IEventBus eventBus) {
        ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        BRONZE_ALLOY = ITEMS.register("bronze_alloy", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        LEAD_INGOT = ITEMS.register("lead_ingot", () -> new LeadIngot(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        LITHIUM_INGOT = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        RUBY_GEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        SAPPHIRE_GEM = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        LITHIUM_NUGGET = ITEMS.register("lithium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
        URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        URANIUM_ROD = ITEMS.register("uranium_rod", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

        ITEMS.register(eventBus);
    }
}
