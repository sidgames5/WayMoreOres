package dev.sidgames.wmo.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class RadiationPoisoningEffect extends StatusEffect {
    public RadiationPoisoningEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.world.isClient()) {
            pLivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 2, pAmplifier, true, false, false));
            pLivingEntity.damage(new DamageSource("radiation"), 0.1F * (pAmplifier + 1));
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
