package com.reed.armoreffects;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;


public class ArmorFX {
    public static void applyArmorEffects(ServerPlayer player) {
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);


        // Leather gear
        if (helmet.is(Items.LEATHER_HELMET)) {
            applyPieceEffect(player, "LEATHER", "HEAD");
        }
        if (chestplate.is(Items.LEATHER_CHESTPLATE)) {
            applyPieceEffect(player, "LEATHER", "CHEST");
        }
        if (leggings.is(Items.LEATHER_LEGGINGS)) {
            applyPieceEffect(player, "LEATHER", "LEGS");
        }
        if (boots.is(Items.LEATHER_BOOTS)) {
            applyPieceEffect(player, "LEATHER", "FEET");
        }


        // Full Leather
        if (helmet.is(Items.LEATHER_HELMET) &&
                chestplate.is(Items.LEATHER_CHESTPLATE) &&
                leggings.is(Items.LEATHER_LEGGINGS) &&
                boots.is(Items.LEATHER_BOOTS)) {
            applyFullSetEffect(player, "LEATHER");
        }


        // Copper gear
        if (helmet.is(Items.COPPER_HELMET)) {
            applyPieceEffect(player, "COPPER", "HEAD");
        }
        if (chestplate.is(Items.COPPER_CHESTPLATE)) {
            applyPieceEffect(player, "COPPER", "CHEST");
        }
        if (leggings.is(Items.COPPER_LEGGINGS)) {
            applyPieceEffect(player, "COPPER", "LEGS");
        }
        if (boots.is(Items.COPPER_BOOTS)) {
            applyPieceEffect(player, "COPPER", "FEET");
        }


       // Full Copper
        if (helmet.is(Items.COPPER_HELMET) &&
                chestplate.is(Items.COPPER_CHESTPLATE) &&
                leggings.is(Items.COPPER_LEGGINGS) &&
                boots.is(Items.COPPER_BOOTS)) {
            applyFullSetEffect(player, "COPPER");
        }


        // Iron gear
        if (helmet.is(Items.IRON_HELMET)) {
            applyPieceEffect(player, "IRON", "HEAD");
        }
        if (chestplate.is(Items.IRON_CHESTPLATE)) {
            applyPieceEffect(player, "IRON", "CHEST");
        }
        if (leggings.is(Items.IRON_LEGGINGS)) {
            applyPieceEffect(player, "IRON", "LEGS");
        }
        if (boots.is(Items.IRON_BOOTS)) {
            applyPieceEffect(player, "IRON", "FEET");
        }


        // Full Iron
        if (helmet.is(Items.IRON_HELMET) &&
                chestplate.is(Items.IRON_CHESTPLATE) &&
                leggings.is(Items.IRON_LEGGINGS) &&
                boots.is(Items.IRON_BOOTS)) {
            applyFullSetEffect(player, "IRON");
        }



        // GOLDEN gear
        if (helmet.is(Items.GOLDEN_HELMET)) {
            applyPieceEffect(player, "GOLDEN", "HEAD");
        }
        if (chestplate.is(Items.GOLDEN_CHESTPLATE)) {
            applyPieceEffect(player, "GOLDEN", "CHEST");
        }
        if (leggings.is(Items.GOLDEN_LEGGINGS)) {
            applyPieceEffect(player, "GOLDEN", "LEGS");
        }
        if (boots.is(Items.GOLDEN_BOOTS)) {
            applyPieceEffect(player, "GOLDEN", "FEET");
        }


        // Full GOLDEN
        if (helmet.is(Items.GOLDEN_HELMET) &&
                chestplate.is(Items.GOLDEN_CHESTPLATE) &&
                leggings.is(Items.GOLDEN_LEGGINGS) &&
                boots.is(Items.GOLDEN_BOOTS)) {
            applyFullSetEffect(player, "GOLDEN");
        }



        // Diamond gear
        if (helmet.is(Items.DIAMOND_HELMET)) {
            applyPieceEffect(player, "DIAMOND", "HEAD");
        }
        if (chestplate.is(Items.DIAMOND_CHESTPLATE)) {
            applyPieceEffect(player, "DIAMOND", "CHEST");
        }
        if (leggings.is(Items.DIAMOND_LEGGINGS)) {
            applyPieceEffect(player, "DIAMOND", "LEGS");
        }
        if (boots.is(Items.DIAMOND_BOOTS)) {
            applyPieceEffect(player, "DIAMOND", "FEET");
        }

        // Full Diamond
        if (helmet.is(Items.DIAMOND_HELMET) &&
                chestplate.is(Items.DIAMOND_CHESTPLATE) &&
                leggings.is(Items.DIAMOND_LEGGINGS) &&
                boots.is(Items.DIAMOND_BOOTS)) {
            applyFullSetEffect(player, "DIAMOND");
        }

        // Netherite gear
        if (helmet.is(Items.NETHERITE_HELMET)) {
            applyPieceEffect(player, "NETHERITE", "HEAD");
        }
        if (chestplate.is(Items.NETHERITE_CHESTPLATE)) {
            applyPieceEffect(player, "NETHERITE", "CHEST");
        }
        if (leggings.is(Items.NETHERITE_LEGGINGS)) {
            applyPieceEffect(player, "NETHERITE", "LEGS");
        }
        if (boots.is(Items.NETHERITE_BOOTS)) {
            applyPieceEffect(player, "NETHERITE", "FEET");
        }


       // Full Netherite
        if (helmet.is(Items.NETHERITE_HELMET) &&
                chestplate.is(Items.NETHERITE_CHESTPLATE) &&
                leggings.is(Items.NETHERITE_LEGGINGS) &&
                boots.is(Items.NETHERITE_BOOTS)) {
            applyFullSetEffect(player, "NETHERITE");
        }

    }
    /**
     * Apply an individual armor piece effect.
     * @param player The player wearing the armor
     * @param material Armor material identifier (e.g., "DIAMOND")
     * @param slot Armor slot ("HEAD", "CHEST", "LEGS", "FEET")
     */

    private static void applyPieceEffect(ServerPlayer player, String material, String slot) {
        if(material.equals("LEATHER")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.LUCK, 20, 1, false, false
            ));
        }
        if (material.equals("IRON")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.STRENGTH, 20, 1, false, false
            ));
        }
        if (material.equals("COPPER")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.SPEED, 20, 1, false, false
            ));
        }
        if (material.equals("GOLDEN")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE, 20, 1, false, false
            ));
        }
        if (material.equals("DIAMOND")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.NIGHT_VISION, 20 * 15, 1, false, false
            ));
        }
        if (material.equals("NETHERITE")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.HEALTH_BOOST, 20, 1, false, false
            ));
        }
    }
    public static void applyFullSetEffect(ServerPlayer player, String material) {
        if(material.equals("LEATHER")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.LUCK, 20, 4, false, false
            ));
        }
        if (material.equals("IRON")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.STRENGTH, 20, 1, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.RESISTANCE, 20, 1, false, false
            ));
        }
        if (material.equals("COPPER")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.SPEED, 20, 2, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.JUMP_BOOST, 20, 1, false, false
            ));
        }
        if (material.equals("GOLDEN")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE, 20, 2, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.SLOW_FALLING, 20, 2, false, false
            ));
            player.addEffect(new  MobEffectInstance(
                    MobEffects.REGENERATION, 20, 1, false, false
            ));
        }
        if (material.equals("DIAMOND")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.NIGHT_VISION, 20 * 15, 1, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.HASTE, 20, 2, false, false
            ));
        }
        if (material.equals("NETHERITE")) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.HEALTH_BOOST, 20, 1, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.CONDUIT_POWER, 20, 1, false, false
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE, 20, 1, false, false
            ));
        }
    }

}
