package com.reed.armoreffects;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class ArmorFX {
    public static void applyArmorEffects(ServerPlayerEntity player) {
        ItemStack helmet = player.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack leggings = player.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);


        // Leather gear
        if (helmet.isOf(Items.LEATHER_HELMET)) {
            applyPieceEffect(player, "LEATHER", "HEAD");
        }
        if (chestplate.isOf(Items.LEATHER_CHESTPLATE)) {
            applyPieceEffect(player, "LEATHER", "CHEST");
        }
        if (leggings.isOf(Items.LEATHER_LEGGINGS)) {
            applyPieceEffect(player, "LEATHER", "LEGS");
        }
        if (boots.isOf(Items.LEATHER_BOOTS)) {
            applyPieceEffect(player, "LEATHER", "FEET");
        }


        // Full Leather
        if (helmet.isOf(Items.LEATHER_HELMET) &&
                chestplate.isOf(Items.LEATHER_CHESTPLATE) &&
                leggings.isOf(Items.LEATHER_LEGGINGS) &&
                boots.isOf(Items.LEATHER_BOOTS)) {
            applyFullSetEffect(player, "LEATHER");
        }


        // Copper gear
        if (helmet.isOf(Items.COPPER_HELMET)) {
            applyPieceEffect(player, "COPPER", "HEAD");
        }
        if (chestplate.isOf(Items.COPPER_CHESTPLATE)) {
            applyPieceEffect(player, "COPPER", "CHEST");
        }
        if (leggings.isOf(Items.COPPER_LEGGINGS)) {
            applyPieceEffect(player, "COPPER", "LEGS");
        }
        if (boots.isOf(Items.COPPER_BOOTS)) {
            applyPieceEffect(player, "COPPER", "FEET");
        }


       // Full Copper
        if (helmet.isOf(Items.COPPER_HELMET) &&
                chestplate.isOf(Items.COPPER_CHESTPLATE) &&
                leggings.isOf(Items.COPPER_LEGGINGS) &&
                boots.isOf(Items.COPPER_BOOTS)) {
            applyFullSetEffect(player, "COPPER");
        }


        // Iron gear
        if (helmet.isOf(Items.IRON_HELMET)) {
            applyPieceEffect(player, "IRON", "HEAD");
        }
        if (chestplate.isOf(Items.IRON_CHESTPLATE)) {
            applyPieceEffect(player, "IRON", "CHEST");
        }
        if (leggings.isOf(Items.IRON_LEGGINGS)) {
            applyPieceEffect(player, "IRON", "LEGS");
        }
        if (boots.isOf(Items.IRON_BOOTS)) {
            applyPieceEffect(player, "IRON", "FEET");
        }


        // Full Iron
        if (helmet.isOf(Items.IRON_HELMET) &&
                chestplate.isOf(Items.IRON_CHESTPLATE) &&
                leggings.isOf(Items.IRON_LEGGINGS) &&
                boots.isOf(Items.IRON_BOOTS)) {
            applyFullSetEffect(player, "IRON");
        }



        // GOLDEN gear
        if (helmet.isOf(Items.GOLDEN_HELMET)) {
            applyPieceEffect(player, "GOLDEN", "HEAD");
        }
        if (chestplate.isOf(Items.GOLDEN_CHESTPLATE)) {
            applyPieceEffect(player, "GOLDEN", "CHEST");
        }
        if (leggings.isOf(Items.GOLDEN_LEGGINGS)) {
            applyPieceEffect(player, "GOLDEN", "LEGS");
        }
        if (boots.isOf(Items.GOLDEN_BOOTS)) {
            applyPieceEffect(player, "GOLDEN", "FEET");
        }


        // Full GOLDEN
        if (helmet.isOf(Items.GOLDEN_HELMET) &&
                chestplate.isOf(Items.GOLDEN_CHESTPLATE) &&
                leggings.isOf(Items.GOLDEN_LEGGINGS) &&
                boots.isOf(Items.GOLDEN_BOOTS)) {
            applyFullSetEffect(player, "GOLDEN");
        }



        // Diamond gear
        if (helmet.isOf(Items.DIAMOND_HELMET)) {
            applyPieceEffect(player, "DIAMOND", "HEAD");
        }
        if (chestplate.isOf(Items.DIAMOND_CHESTPLATE)) {
            applyPieceEffect(player, "DIAMOND", "CHEST");
        }
        if (leggings.isOf(Items.DIAMOND_LEGGINGS)) {
            applyPieceEffect(player, "DIAMOND", "LEGS");
        }
        if (boots.isOf(Items.DIAMOND_BOOTS)) {
            applyPieceEffect(player, "DIAMOND", "FEET");
        }

        // Full Diamond
        if (helmet.isOf(Items.DIAMOND_HELMET) &&
                chestplate.isOf(Items.DIAMOND_CHESTPLATE) &&
                leggings.isOf(Items.DIAMOND_LEGGINGS) &&
                boots.isOf(Items.DIAMOND_BOOTS)) {
            applyFullSetEffect(player, "DIAMOND");
        }

        // Netherite gear
        if (helmet.isOf(Items.NETHERITE_HELMET)) {
            applyPieceEffect(player, "NETHERITE", "HEAD");
        }
        if (chestplate.isOf(Items.NETHERITE_CHESTPLATE)) {
            applyPieceEffect(player, "NETHERITE", "CHEST");
        }
        if (leggings.isOf(Items.NETHERITE_LEGGINGS)) {
            applyPieceEffect(player, "NETHERITE", "LEGS");
        }
        if (boots.isOf(Items.NETHERITE_BOOTS)) {
            applyPieceEffect(player, "NETHERITE", "FEET");
        }


       // Full Netherite
        if (helmet.isOf(Items.NETHERITE_HELMET) &&
                chestplate.isOf(Items.NETHERITE_CHESTPLATE) &&
                leggings.isOf(Items.NETHERITE_LEGGINGS) &&
                boots.isOf(Items.NETHERITE_BOOTS)) {
            applyFullSetEffect(player, "NETHERITE");
        }

    }
    /**
     * Apply an individual armor piece effect.
     * @param player The player wearing the armor
     * @param material Armor material identifier (e.g., "DIAMOND")
     * @param slot Armor slot ("HEAD", "CHEST", "LEGS", "FEET")
     */

    private static void applyPieceEffect(ServerPlayerEntity player, String material, String slot) {
        if(material.equals("LEATHER")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.LUCK, 20, 1, false, false
            ));
        }
        if (material.equals("IRON")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.STRENGTH, 20, 1, false, false
            ));
        }
        if (material.equals("COPPER")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SPEED, 20, 1, false, false
            ));
        }
        if (material.equals("GOLDEN")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 20, 1, false, false
            ));
        }
        if (material.equals("DIAMOND")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.NIGHT_VISION, 22, 1, false, false
            ));
        }
        if (material.equals("NETHERITE")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.HEALTH_BOOST, 20, 1, false, false
            ));
        }
    }
    public static void applyFullSetEffect(ServerPlayerEntity player, String material) {
        if(material.equals("LEATHER")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.LUCK, 20, 4, false, false
            ));
        }
        if (material.equals("IRON")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.STRENGTH, 20, 1, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.RESISTANCE, 20, 1, false, false
            ));
        }
        if (material.equals("COPPER")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SPEED, 20, 2, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.JUMP_BOOST, 20, 1, false, false
            ));
        }
        if (material.equals("GOLDEN")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 20, 2, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.SLOW_FALLING, 20, 2, false, false
            ));
            player.addStatusEffect(new  StatusEffectInstance(
                    StatusEffects.REGENERATION, 20, 1, false, false
            ));
        }
        if (material.equals("DIAMOND")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.NIGHT_VISION, 20 * 15, 1, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.HASTE, 20, 2, false, false
            ));
        }
        if (material.equals("NETHERITE")) {
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.HEALTH_BOOST, 20, 1, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.CONDUIT_POWER, 20, 1, false, false
            ));
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 20, 1, false, false
            ));
        }
    }

}
