package dev.sidgames.wmo;

import dev.sidgames.wmo.item.AluminumIngot;
import dev.sidgames.wmo.item.AluminumNugget;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemLoader {
    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_ingot"),
                new AluminumIngot(new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_nugget"),
                new AluminumNugget(new Item.Settings().group(ItemGroup.MATERIALS)));
    }

}
