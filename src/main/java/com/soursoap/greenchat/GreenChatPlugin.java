package com.soursoap.greenchat;

import org.bukkit.plugin.java.JavaPlugin;

public class GreenChatPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Register the chat event listener
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().info("GreenChatPlugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("GreenChatPlugin has been disabled.");
    }
}

