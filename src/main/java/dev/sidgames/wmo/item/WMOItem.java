package dev.sidgames.wmo.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class WMOItem extends Item {
    public WMOItem(ItemGroup group) {
        super(new Item.Settings().group(group));
    }
}
