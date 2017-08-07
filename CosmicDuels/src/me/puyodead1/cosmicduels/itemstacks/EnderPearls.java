package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class EnderPearls {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack enderPearlsEnabled() {
		ItemStack enderPearls = new ItemStack(Material.ENDER_PEARL);
		ItemMeta enderPearlsMeta = enderPearls.getItemMeta();
		
		enderPearlsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		enderPearlsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		enderPearlsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		enderPearlsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lEnder Pearls"));
		
		ArrayList<String> enderPearlsLore = new ArrayList<String>();
		enderPearlsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		enderPearlsMeta.setLore(enderPearlsLore);
		enderPearls.setItemMeta(enderPearlsMeta);
		
		return enderPearls;
	}
	
	public ItemStack enderPearlsDisabled() {
		ItemStack enderPearls = new ItemStack(Material.ENDER_PEARL);
		ItemMeta enderPearlsMeta = enderPearls.getItemMeta();
		
		enderPearlsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		enderPearlsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		enderPearlsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		enderPearlsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lEnder Pearls"));
		
		ArrayList<String> enderPearlsLore = new ArrayList<String>();
		enderPearlsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		enderPearlsMeta.setLore(enderPearlsLore);
		enderPearls.setItemMeta(enderPearlsMeta);
		
		return enderPearls;
	}

}
