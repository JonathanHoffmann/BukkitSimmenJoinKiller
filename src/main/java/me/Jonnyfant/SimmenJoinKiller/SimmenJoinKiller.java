package me.Jonnyfant.SimmenJoinKiller;

import org.bukkit.plugin.java.JavaPlugin;

public class SimmenJoinKiller extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SimmmenJoinListener(this),this);
    }
}
