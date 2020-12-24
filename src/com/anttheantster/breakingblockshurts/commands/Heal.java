package com.anttheantster.breakingblockshurts.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (s.equalsIgnoreCase("heal")){
            if (sender instanceof Player){
                ((Player) sender).setHealth(20);
                return false;
            }
            return false;
        }

        return false;
    }
}
