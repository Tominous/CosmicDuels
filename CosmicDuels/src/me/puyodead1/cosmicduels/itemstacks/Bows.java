package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Bows {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack bowsEnabled() {
		ItemStack bows = new ItemStack(Material.BOW);
		ItemMeta bowsMeta = bows.getItemMeta();
		
		bowsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bowsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		bowsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		bowsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lBows"));
		
		ArrayList<String> bowsLore = new ArrayList<String>();
		bowsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		bowsMeta.setLore(bowsLore);
		bows.setItemMeta(bowsMeta);
		
		return bows;
	}
	
	public ItemStack bowsDisabled() {
		ItemStack bows = new ItemStack(Material.BOW);
		ItemMeta bowsMeta = bows.getItemMeta();
		
		bowsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bowsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		bowsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		bowsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lBows"));
		
		ArrayList<String> bowsLore = new ArrayList<String>();
		bowsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		bowsMeta.setLore(bowsLore);
		bows.setItemMeta(bowsMeta);
		
		return bows;
	}

}
