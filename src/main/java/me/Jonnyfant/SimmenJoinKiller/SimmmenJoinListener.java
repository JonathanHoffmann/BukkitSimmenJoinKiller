package me.Jonnyfant.SimmenJoinKiller;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;


public class SimmmenJoinListener implements Listener {
    Plugin plug;
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.getName().equals("Simmmen"))
        {
            p.setHealth(0);
            Bukkit.broadcastMessage(ChatColor.BLUE + "<Greger> " + ChatColor.WHITE + "I told you!");
            Bukkit.getPluginManager().disablePlugin(plug);
        }

    }

    public SimmmenJoinListener(Plugin plugin) {
        plug=plugin;
    }
}