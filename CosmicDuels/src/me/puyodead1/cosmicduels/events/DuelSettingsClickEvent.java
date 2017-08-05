package me.puyodead1.cosmicduels.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;
import me.puyodead1.cosmicduels.itemstacks.GlassPane;
import me.puyodead1.cosmicduels.itemstacks.GoldenApple;

public class DuelSettingsClickEvent implements Listener {
	boolean goldenApplesToggled = true;

	@EventHandler
	public void onGoldenAppleClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().equalsIgnoreCase("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Golden Apples")) {
				if (goldenApplesToggled == false) {
					goldenApplesToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.stat = "§a§lON";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				} else {
					goldenApplesToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.stat = "§c§lOFF";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				}
			}
		}
	}

}
