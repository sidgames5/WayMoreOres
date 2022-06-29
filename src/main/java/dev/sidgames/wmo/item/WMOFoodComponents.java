package dev.sidgames.wmo.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class WMOFoodComponents {
    public static final FoodComponent LEAD_INGOT = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 1.0f).build();
}
