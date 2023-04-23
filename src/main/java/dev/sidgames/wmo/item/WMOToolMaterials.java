package dev.sidgames.wmo.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum WMOToolMaterials implements ToolMaterial {
    ALUMINUM(MiningLevels.IRON, 90, 3.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.ALUMINUM_INGOT)),
    BRONZE(MiningLevels.IRON, 550, 6.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.BRONZE_ALLOY)),
    LEAD(MiningLevels.IRON, 15, 4.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.LEAD_INGOT)),
    LITHIUM(MiningLevels.IRON, 20, 5.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.LITHIUM_INGOT)),
    PLATINUM(MiningLevels.IRON, 150, 6.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    RUBY(MiningLevels.IRON, 9, 3.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.RUBY_GEM)),
    SAPPHIRE(MiningLevels.IRON, 9, 3.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.SAPPHIRE_GEM)),
    SILVER(MiningLevels.IRON, 110, 3.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    TIN(MiningLevels.IRON, 220, 5.0F, 0.0F, 14, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    ENDERITE(MiningLevels.NETHERITE, 2591, 15.0F, 6.0F, 14, () -> Ingredient.ofItems(ModItems.ENDERITE_SHARD));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private WMOToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
