package me.FluffyNarwhals.MyPet;

import me.FluffyNarwhals.MyPet.Commands.*;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	
	public static Plugin pl;
	public static PluginDescriptionFile p;
	
	public void onEnable(){
		
		pl = this;
		p = this.getDescription();
		
		this.getCommand("mypet").setExecutor(new MyPetCommand());
		
		this.registerConfig();
		
	}
	
	public void registerConfig(){
		this.saveDefaultConfig();
	}
	
	public String getPrefix(){
		return ChatColor.GREEN + "[" + ChatColor.AQUA + "MyPet" + ChatColor.GREEN + "] " + ChatColor.DARK_AQUA;
	}
	
}
