package dev.sidgames.wmo.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum WMOArmorMaterials implements ArmorMaterial {
    ALUMINUM("aluminum", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.ALUMINUM_INGOT)),
    BRONZE("bronze", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.BRONZE_ALLOY)),
    LEAD("lead", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.LEAD_INGOT)),
    LITHIUM("lithium", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.LITHIUM_INGOT)),
    PLATINUM("platinum", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.PLATINUM_INGOT)),
    RUBY("ruby", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.RUBY)),
    SAPPHIRE("sapphire", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.SAPPHIRE)),
    SILVER("silver", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.SILVER_INGOT)),
    TIN("tin", 16, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.TIN_INGOT));

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private WMOArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}
