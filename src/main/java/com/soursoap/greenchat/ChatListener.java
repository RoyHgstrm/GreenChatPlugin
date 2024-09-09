package com.soursoap.greenchat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.ChatColor;

public class ChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // Change the message color to green using ChatColor
        String greenMessage = ChatColor.GREEN + event.getMessage();
        event.setMessage(greenMessage);
    }
}
