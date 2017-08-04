package me.puyodead1.cosmicduels.api;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.ChatColor;

public class CosmicDuelsAPI {

	public static Inventory createInventory(InventoryHolder owner, int size, String title, Player player) {
		Inventory inv = Bukkit.createInventory(owner, size, title);
		player.openInventory(inv);

		return inv;
	}

	public static Inventory createMainDuelGUI(Player player) {
		Inventory inv = createInventory(null, 9, "Duel Type", player);
		int inQueue = 0;
		int ELO = 291;
		String rank = "N/A";

		ItemStack ranked = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta rankedMeta = ranked.getItemMeta();

		rankedMeta.setDisplayName(
				ChatColor.translateAlternateColorCodes('&', "&a&lRanked &7(&a&n" + inQueue + "&7 in queue&7)"));

		ArrayList<String> rankedlore = new ArrayList<String>();
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&a&lELO: &a{ELO}").replace("{ELO}", String.valueOf(ELO)));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Click to enter Ranked Duel Mode."));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Fight using your custom &7&n/duel godset&7!"));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&a&lRank: &a{RANK}").replace("{RANK}", rank));
		rankedMeta.setLore(rankedlore);

		ranked.setItemMeta(rankedMeta);
		inv.setItem(3, ranked);
		return inv;
	}

}
