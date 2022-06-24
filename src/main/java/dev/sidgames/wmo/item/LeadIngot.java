package dev.sidgames.wmo.item;

import dev.sidgames.wmo.effects.LeadPoisoning;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LeadIngot extends ItemBase {
    public LeadIngot(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.wmo.lead_ingot.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.wmo.lead_ingot.tooltip.hint"));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // give the player the poison effect
        LeadPoisoning.trigger(world, user, hand);
        return super.use(world, user, hand);
    }
}

