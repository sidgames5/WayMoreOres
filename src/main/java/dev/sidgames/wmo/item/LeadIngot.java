package dev.sidgames.wmo.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class LeadIngot extends ItemBase {
    public LeadIngot(Settings settings) {
        super(settings);
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // give the player the poison effect
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 60 * 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20 * 60 * 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 60 * 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 60 * 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 60 * 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 60 * 5));
        return super.use(world, user, hand);
    }
}

