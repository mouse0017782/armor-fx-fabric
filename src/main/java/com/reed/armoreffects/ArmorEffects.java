package com.reed.armoreffects;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmorEffects implements ModInitializer {
	public static final String MOD_ID = "armor-effects";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Armor effects mod initialized!");

		ServerTickEvents.END_SERVER_TICK.register((MinecraftServer server) -> {
			for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
				ArmorFX.applyArmorEffects(player);
			}
		});
	}
}