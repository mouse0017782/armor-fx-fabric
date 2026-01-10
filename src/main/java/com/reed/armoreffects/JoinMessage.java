package com.reed.armoreffects;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.ClickEvent;
import net.minecraft.util.Formatting;
import java.net.URI;

public class JoinMessage {

    private static final String MODRINTH_URL = "https://modrinth.com/mod/bGmVar41";

    public static void init() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            ServerPlayerEntity player = handler.player;

            server.execute(() -> {
                Text msg = Text.literal("Armor Effects Active.\n")
                        .formatted(Formatting.AQUA, Formatting.BOLD)
                        .append(
                                Text.literal("Click here to view the mod on Modrinth for documentation")
                                        .formatted(Formatting.YELLOW, Formatting.UNDERLINE)
                                        .setStyle(
                                                Style.EMPTY.withClickEvent(
                                                        new ClickEvent.OpenUrl(URI.create(MODRINTH_URL))
                                                )
                                        )
                        );

                player.sendMessage(msg, false);
            });
        });
    }
}
