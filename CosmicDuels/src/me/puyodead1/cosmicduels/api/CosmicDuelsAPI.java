package me.puyodead1.cosmicduels.api;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.puyodead1.cosmicduels.itemstacks.Bows;
import me.puyodead1.cosmicduels.itemstacks.GlassPane;
import me.puyodead1.cosmicduels.itemstacks.GoldenApple;
import me.puyodead1.cosmicduels.itemstacks.Healing;
import me.puyodead1.cosmicduels.itemstacks.Mcmmo;
import me.puyodead1.cosmicduels.itemstacks.Potions;

public class CosmicDuelsAPI {

	public static ArrayList<String> goldenAppleLore;
	
	public static Inventory createInventory(InventoryHolder owner, int size, String title, Player player) {
		Inventory inv = Bukkit.createInventory(owner, size, title);
		player.openInventory(inv);

		return inv;
	}

	public static ArrayList<Boolean> settingsList() {
		ArrayList<Boolean> settings = new ArrayList<Boolean>();
		return settings;

	}

	public static Inventory createDuelSettingsGUI(Player player) {
		Inventory inv = createInventory(null, 27, "Duel Settings", player);

		inv.setItem(0, new GoldenApple().goldenAppleEnabled());
		inv.setItem(1, new Mcmmo().mcmmoEnabled());	
		inv.setItem(2, new Potions().potionsEnabled());
		inv.setItem(3, new Bows().bowsEnabled());
		inv.setItem(4, new Healing().healingEnabled());
		
		inv.setItem(9, new GlassPane().grayGlassPane());
		inv.setItem(13, new GlassPane().grayGlassPane());
		inv.setItem(17, new GlassPane().grayGlassPane());
		inv.setItem(19, new GlassPane().grayGlassPane());
		inv.setItem(20, new GlassPane().grayGlassPane());
		inv.setItem(21, new GlassPane().grayGlassPane());
		inv.setItem(22, new GlassPane().greenGlassPane());
		inv.setItem(23, new GlassPane().grayGlassPane());
		inv.setItem(24, new GlassPane().grayGlassPane());
		inv.setItem(25, new GlassPane().grayGlassPane());
		return inv;
	}

	public static Inventory createMainDuelGUI(Player player) {
		Inventory inv = createInventory(null, 9, "Duel Type", player);

		// RANKED DUEL ITEM
		int inQueue = 0;
		int ELO = 291;
		String rank = "N/A";

		ItemStack ranked = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta rankedMeta = ranked.getItemMeta();

		rankedMeta.setDisplayName(
				ChatColor.translateAlternateColorCodes('&', "&a&lRanked &7(&a&n" + inQueue + "&7 in queue&7)"));

		ArrayList<String> rankedlore = new ArrayList<String>();
		rankedlore.add(
				ChatColor.translateAlternateColorCodes('&', "&a&lELO: &a{ELO}").replace("{ELO}", String.valueOf(ELO)));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Click to enter Ranked Duel Mode."));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Fight using your custom &7&n/duel godset&7!"));
		rankedlore.add(ChatColor.translateAlternateColorCodes('&', "&a&lRank: &a{RANK}").replace("{RANK}", rank));
		rankedMeta.setLore(rankedlore);

		ranked.setItemMeta(rankedMeta);
		//

		// UNRANKED DUEL ITEM
		ItemStack unranked = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta unrankedMeta = unranked.getItemMeta();

		unrankedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lUnranked"));

		ArrayList<String> unrankedlore = new ArrayList<String>();
		unrankedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Click to enter the Unranked Duel Queue."));
		unrankedMeta.setLore(unrankedlore);

		unranked.setItemMeta(unrankedMeta);
		//

		inv.setItem(3, ranked);
		inv.setItem(5, unranked);
		return inv;
	}

}
