package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Potions {
	
	public static String lore = "§a§lENABLED";
	
	public ItemStack potionsEnabled() {
		ItemStack potions = new ItemStack(Material.BREWING_STAND_ITEM);
		ItemMeta potionsMeta = potions.getItemMeta();
		potionsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		potionsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		potionsMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, false);
		
		potionsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lPotions"));

		ArrayList<String> potionsLore = new ArrayList<String>();
		potionsLore.addAll(Arrays.asList(lore, "", "§7Click to §7§ntoggle§7 this setting."));
		potionsMeta.setLore(potionsLore);

		potions.setItemMeta(potionsMeta);
		return potions;
	}
	
	public ItemStack potionsDisabled() {
		ItemStack potions = new ItemStack(Material.BREWING_STAND_ITEM);
		ItemMeta potionsMeta = potions.getItemMeta();
		potionsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		potionsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		potionsMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, false);
		
		potionsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lPotions"));

		ArrayList<String> potionsLore = new ArrayList<String>();
		potionsLore.addAll(Arrays.asList(lore, "", "§7Click to §7§ntoggle§7 this setting."));
		potionsMeta.setLore(potionsLore);

		potions.setItemMeta(potionsMeta);
		return potions;
	}

}
