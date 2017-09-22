package net.xornick.mcsoups.handlers;

import net.xornick.mcsoups.McSoups;
import net.xornick.mcsoups.listeners.ChatListener;

import java.util.stream.Stream;

public class ListenerHandler {

    private final McSoups plugin;

    public ListenerHandler(McSoups plugin) {
        this.plugin = plugin;
    }

    public void registerListeners() {
        Stream.of(new ChatListener()).forEach(listener -> plugin.getServer().getPluginManager().registerEvents(listener, plugin));
    }
}
