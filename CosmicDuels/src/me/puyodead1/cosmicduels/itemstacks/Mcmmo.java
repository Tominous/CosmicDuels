package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Mcmmo {
	
	public static String lore = "§a§lENABLED";
	
	public ItemStack mcmmoEnabled() {
		ItemStack mcmmo = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta mcmmoMeta = mcmmo.getItemMeta();
		
		mcmmoMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		mcmmoMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mcmmoMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		mcmmoMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lMCMMO"));
		
		ArrayList<String> mcmmoLore = new ArrayList<String>();
		mcmmoLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		mcmmoMeta.setLore(mcmmoLore);
		mcmmo.setItemMeta(mcmmoMeta);
		
		return mcmmo;
	}
	
	public ItemStack mcmmoDisabled() {
		ItemStack mcmmo = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta mcmmoMeta = mcmmo.getItemMeta();
		
		mcmmoMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		mcmmoMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mcmmoMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		mcmmoMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lMCMMO"));
		
		ArrayList<String> mcmmoLore = new ArrayList<String>();
		mcmmoLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		mcmmoMeta.setLore(mcmmoLore);
		mcmmo.setItemMeta(mcmmoMeta);
		
		return mcmmo;
	}

}
