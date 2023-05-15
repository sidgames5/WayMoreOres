package dev.sidgames.wmo.effect;

import dev.sidgames.wmo.Reference;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect RADIATION_POISONING;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Reference.MOD_ID, name), new RadiationPoisoningEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        RADIATION_POISONING = registerStatusEffect("radiation_poisoning");
    }
}
