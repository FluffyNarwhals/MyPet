package me.FluffyNarwhals.MyPet.Commands;

import me.FluffyNarwhals.MyPet.Plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyPetCommand implements CommandExecutor{
	
	private static Plugin pl = Plugin.pl;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(sender instanceof Player){
			
			Player p = (Player) sender;
			
			if(args.length == 0){
				
				p.sendMessage(pl.getPrefix() + ChatColor.DARK_GREEN + "Name: " + ChatColor.DARK_AQUA + "MyPet");
				p.sendMessage(pl.getPrefix() + ChatColor.DARK_GREEN + "Version: " + ChatColor.DARK_AQUA + Plugin.p.getVersion());
				p.sendMessage(pl.getPrefix() + ChatColor.DARK_GREEN + "Creator: " + ChatColor.DARK_AQUA + "FluffyNarwhals");
				p.sendMessage(pl.getPrefix() + "Type /mypet help for a list of commandss");
				
			}
			
			if(args.length > 0){
				
				String command = args[0];
				
				if(command.equalsIgnoreCase("help")){
					
					p.sendMessage(pl.getPrefix() + "/mypet help - Gives list of commands");
					p.sendMessage(pl.getPrefix() + "/mypet name - Renames your pet");
					p.sendMessage(pl.getPrefix() + "/mypet tpto - Teleports to your pet");
					p.sendMessage(pl.getPrefix() + "/mypet tphere - Teleports your pet to you");
					p.sendMessage(pl.getPrefix() + "/mypet mode <passive/aggressive> - Sets your pet's mode");
					p.sendMessage(pl.getPrefix() + "/mypet buy - Buys you a pet");
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
}
