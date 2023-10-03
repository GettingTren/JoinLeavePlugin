package me.ilgroggo.joinleaveplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        if(player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.YELLOW + " just logged in, welcome back!");
        }else{
            e.setJoinMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.YELLOW + " joined for the first time!! Welcome!");
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.YELLOW +  " just left. Let's hope he come back one day...");

    }
}
