package com.github.underplayer97.LThu.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.underplayer97.LThu.Main;
import com.github.underplayer97.LThu.utils.Utils;


public class LeaveCmd implements CommandExecutor{
	
	private Main plugin; 
	
	public LeaveCmd(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("leave").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {		
		if(!(sender instanceof Player)) {
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("console_error_message")));
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("LThu.Leave")) {
			 {
				 Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "server skywars");
				return true;
		}}
				

				
			 else {
				p.sendMessage(Utils.chat(plugin.getConfig().getString("no_perm_error")));
			}
				return false;
	}
	
}
