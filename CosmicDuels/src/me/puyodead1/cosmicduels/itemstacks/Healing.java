package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Healing {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack healingEnabled() {
		ItemStack healing = new ItemStack(Material.GHAST_TEAR);
		ItemMeta healingMeta = healing.getItemMeta();
		
		healingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		healingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		healingMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		healingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lHealing"));
		
		ArrayList<String> healingLore = new ArrayList<String>();
		healingLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		healingMeta.setLore(healingLore);
		healing.setItemMeta(healingMeta);
		
		return healing;
	}
	
	public ItemStack healingDisabled() {
		ItemStack healing = new ItemStack(Material.GHAST_TEAR);
		ItemMeta healingMeta = healing.getItemMeta();
		
		healingMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		healingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		healingMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		healingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lHealing"));
		
		ArrayList<String> healingLore = new ArrayList<String>();
		healingLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		healingMeta.setLore(healingLore);
		healing.setItemMeta(healingMeta);
		
		return healing;
	}

}
