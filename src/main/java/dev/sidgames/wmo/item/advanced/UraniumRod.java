package dev.sidgames.wmo.item.advanced;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class UraniumRod extends Item {
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 8000;
    }

    public UraniumRod(Properties pProperties) {
        super(pProperties);
    }
}
