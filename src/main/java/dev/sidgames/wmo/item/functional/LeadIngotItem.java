package dev.sidgames.wmo.item.functional;

import dev.sidgames.wmo.item.WMOItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LeadIngotItem extends Item {
    public LeadIngotItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.wmo.lead_ingot.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("item.wmo.lead_ingot.tooltip.hint"));
        }
    }
}

