package me.puyodead1.cosmicduels;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.puyodead1.cosmicduels.commands.DuelCommand;
import me.puyodead1.cosmicduels.events.DuelSettingsClickEvent;
import me.puyodead1.cosmicduels.events.DuelTypeClickEvent;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	public void onEnable() {
		registerCommands();
		registerConfig();
		registerEvents();
	}
	
	public void onDisable() {
		
	}
	
	public void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	public void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new DuelSettingsClickEvent(), this);
		Bukkit.getPluginManager().registerEvents(new DuelTypeClickEvent(), this);
	}
	
	public void registerCommands() {
		getCommand("duel").setExecutor(new DuelCommand());
	}
	
	public static Main getInstance() {
		return instance;
	}

}
