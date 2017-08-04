package me.puyodead1.cosmicduels.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;

public class DuelCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("duel")) {
			if (sender instanceof Player) {
				if (args.length == 0) {
					Player player = (Player) sender;
					CosmicDuelsAPI.createMainDuelGUI(player);
					// open Duel type selection (Ranked/Unranked)
				}
			}
		}
		return true;
	}

}
