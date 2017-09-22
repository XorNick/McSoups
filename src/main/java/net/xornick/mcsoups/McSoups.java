package net.xornick.mcsoups;

import net.xornick.mcsoups.handlers.ListenerHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class McSoups extends JavaPlugin {

    private static McSoups instance;

    private ListenerHandler listenerHandler;

    @Override
    public void onEnable() {
        System.out.println("Starting up XorNick's McSoups!");
        instance = this;

        System.out.println("Registering listeners!");
        getListenerHandler().registerListeners();

        System.out.println("Done! Welcome to XorNick's McSoups :)");
    }

    public ListenerHandler getListenerHandler() {
        return listenerHandler;
    }
}
