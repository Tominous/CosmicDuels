package me.puyodead1.cosmicduels.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;
import me.puyodead1.cosmicduels.itemstacks.Bows;
import me.puyodead1.cosmicduels.itemstacks.GlassPane;
import me.puyodead1.cosmicduels.itemstacks.GoldenApple;
import me.puyodead1.cosmicduels.itemstacks.Healing;
import me.puyodead1.cosmicduels.itemstacks.Mcmmo;
import me.puyodead1.cosmicduels.itemstacks.Potions;

public class DuelSettingsClickEvent implements Listener {
	boolean goldenApplesToggled = true;
	boolean mcmmoToggled = true;
	boolean potionsToggled = true;
	boolean bowsToggled = true;
	boolean healingToggled = true;

	@EventHandler
	public void onGoldenAppleClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Golden Apples")) {
				if (goldenApplesToggled == false) {
					goldenApplesToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.goldenAppleStat = "§a§lON";
					GoldenApple.lore = "§a§lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				} else {
					goldenApplesToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.goldenAppleStat = "§c§lOFF";
					GoldenApple.lore = "§c§lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				}
			}
		}
	}
	
	@EventHandler
	public void onMcmmoClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().equalsIgnoreCase("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("MCMMO")) {
				if (mcmmoToggled == false) {
					mcmmoToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.mcmmoStat = "§a§lON";
					Mcmmo.lore = "§a§lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(1, new Mcmmo().mcmmoEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(mcmmoToggled));
				} else {
					mcmmoToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.mcmmoStat = "§c§lOFF";
					Mcmmo.lore = "§c§lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(1, new Mcmmo().mcmmoDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(mcmmoToggled));
				}
			}
		}
	}
	
	@EventHandler
	public void onPotionClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Potions")) {
				if (potionsToggled == false) {
					potionsToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.potionsStat = "§a§lON";
					Potions.lore = "§a§lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(2, new Potions().potionsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(potionsToggled));
				} else {
					potionsToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.potionsStat = "§c§lOFF";
					Potions.lore = "§c§lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(2, new Potions().potionsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bowsToggled));
				}
			}
		}
	}
	
	@EventHandler
	public void onBowClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Bows")) {
				if (bowsToggled == false) {
					bowsToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bowStat = "§a§lON";
					Bows.lore = "§a§lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(3, new Bows().bowsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(potionsToggled));
				} else {
					bowsToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bowStat = "§c§lOFF";
					Bows.lore = "§c§lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(3, new Bows().bowsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bowsToggled));
				}
			}
		}
	}
	@EventHandler
	public void onHealingClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Healing")) {
				if (healingToggled == false) {
					healingToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.healingStat = "§a§lON";
					Healing.lore = "§a§lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(4, new Healing().healingEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(healingToggled));
				} else {
					healingToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.healingStat = "§c§lOFF";
					Healing.lore = "§c§lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(4, new Healing().healingDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(healingToggled));
				}
			}
		}
	}

}
