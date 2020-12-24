package com.anttheantster.breakingblockshurts.listeners;

import com.anttheantster.breakingblockshurts.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

public class BlockBreak implements Listener {

    public int damage = Main.getPlugin().getConfig().getInt("Player Damage");

    @EventHandler
    public void BlockBreakEvent(BlockBreakEvent e){
        e.getPlayer().damage(damage);
    }

}
