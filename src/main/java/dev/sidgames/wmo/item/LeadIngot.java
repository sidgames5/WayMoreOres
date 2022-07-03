package dev.sidgames.wmo.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class LeadIngot extends Item {
    public LeadIngot(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        // give the player poison for 20 seconds (400 ticks)
        pPlayer.addEffect(new MobEffectInstance(MobEffects.POISON, 400, 1));
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
