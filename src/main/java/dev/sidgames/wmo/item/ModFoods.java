package dev.sidgames.wmo.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LEAD_INGOT = (new FoodProperties.Builder()).nutrition(0).saturationMod(0.0F).effect(new MobEffectInstance(MobEffects.POISON, 400, 0), 0.3F).meat().build();
}
