package dev.sidgames.wmo.item;

import dev.sidgames.wmo.effects.LeadPoisoning;
import net.minecraft.entity.player.PlayerEntity;
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
        LeadPoisoning.trigger(world, user, hand);
        return super.use(world, user, hand);
    }
}

