package com.reed.armoreffects;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerPlayer;
import java.net.URI;

public class JoinMessage {

    private static final String MODRINTH_URL = "https://modrinth.com/mod/bGmVar41";

    public static void init() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            ServerPlayer player = handler.player;

            server.execute(() -> {
                Component msg = Component.literal("Armor Effects Active.\n")
                        .withStyle(ChatFormatting.AQUA, ChatFormatting.BOLD)
                        .append(
                                Component.literal("Click here to view the mod on Modrinth for documentation")
                                        .withStyle(ChatFormatting.YELLOW, ChatFormatting.UNDERLINE)
                                        .setStyle(
                                                Style.EMPTY.withClickEvent(
                                                        new ClickEvent.OpenUrl(URI.create(MODRINTH_URL))
                                                )
                                        )
                        );

                player.displayClientMessage(msg, false);
            });
        });
    }
}
