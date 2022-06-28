package dev.sidgames.wmo.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum WMOToolMaterials implements ToolMaterial {
    ALUMINUM(MiningLevels.IRON, 90, 1.8F, 0.0F, 14, () -> Ingredient.ofItems(Items.ALUMINUM_INGOT)),
    BRONZE(MiningLevels.IRON, 550, 11.0F, 0.0F, 14, () -> Ingredient.ofItems(Items.BRONZE_ALLOY)),
    LEAD(MiningLevels.IRON, 15, 0.3F, 0.0F, 14, () -> Ingredient.ofItems(Items.LEAD_INGOT)),
    LITHIUM(MiningLevels.IRON, 20, 0.4F, 0.0F, 14, () -> Ingredient.ofItems(Items.LITHIUM_INGOT)),
    PLATINUM(MiningLevels.IRON, 150, 3.0F, 0.0F, 14, () -> Ingredient.ofItems(Items.PLATINUM_INGOT)),
    RUBY(MiningLevels.IRON, 9, 0.2F, 0.0F, 14, () -> Ingredient.ofItems(Items.RUBY_GEM)),
    SAPPHIRE(MiningLevels.IRON, 9, 0.2F, 0.0F, 14, () -> Ingredient.ofItems(Items.SAPPHIRE_GEM)),
    SILVER(MiningLevels.IRON, 110, 2.2F, 0.0F, 14, () -> Ingredient.ofItems(Items.SILVER_INGOT)),
    TIN(MiningLevels.IRON, 220, 4.4F, 0.0F, 14, () -> Ingredient.ofItems(Items.TIN_INGOT));

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
