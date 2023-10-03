package me.ilgroggo.joinleaveplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugins Startup Logic

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }
}
