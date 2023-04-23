package dev.sidgames.wmo.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class WMOSwordItem extends SwordItem {
    public WMOSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
