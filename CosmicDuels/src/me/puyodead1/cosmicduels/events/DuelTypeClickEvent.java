package me.puyodead1.cosmicduels.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.puyodead1.cosmicduels.itemstacks.GlassPane;

public class DuelTypeClickEvent implements Listener{
	
	@EventHandler
	public void onDuelTypeClick(InventoryClickEvent	e) {
		if (e.getClickedInventory().getTitle().equalsIgnoreCase("Duel Type")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Ranked")) {
				e.setCancelled(true);
				e.getWhoClicked().sendMessage("Ranked duels are not implemented yet");
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Unranked")) {
				e.setCancelled(true);
				e.getWhoClicked().sendMessage("Unranked duels are not implemented yet");
			}
		}
		if (e.getClickedInventory().getTitle().contains("Settings")) {
			if (e.getCurrentItem().isSimilar(new GlassPane().grayGlassPane())) {
				e.setCancelled(true);
			}
		}
		if (e.getClickedInventory().getTitle().contains("Settings")) {
			if (e.getCurrentItem().isSimilar(new GlassPane().greenGlassPane())) {
				e.setCancelled(true);
			}
		}
	}

}
