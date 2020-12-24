package com.anttheantster.breakingblockshurts;

import com.anttheantster.breakingblockshurts.commands.Heal;
import com.anttheantster.breakingblockshurts.listeners.BlockBreak;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    PluginDescriptionFile pdf = this.getDescription();
    PluginManager pm = this.getServer().getPluginManager();
    private static Main instance;

    public Main(){
        instance = this;
    }
    public static Main getPlugin(){
        return instance;
    }

    @Override
    public void onEnable() {
        getLogger().info("Ants BlockBreakingHurts Plugin loaded. Version: " + pdf.getVersion());

        pm.registerEvents(new BlockBreak(), this);

        getCommand("heal").setExecutor(new Heal());

        saveDefaultConfig();
    }

    @Override
    public void onDisable() {

    }
}
