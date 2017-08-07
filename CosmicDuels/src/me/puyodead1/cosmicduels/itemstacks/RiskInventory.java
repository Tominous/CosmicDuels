package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class RiskInventory {
	
	
public static String lore = "§a§lENABLED";
	
	public ItemStack riskInventoryEnabled() {
		ItemStack riskInventory = new ItemStack(Material.BONE);
		ItemMeta riskInventoryMeta = riskInventory.getItemMeta();
		
		riskInventoryMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		riskInventoryMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		riskInventoryMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		riskInventoryMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lRisk Inventory"));
		
		ArrayList<String> riskInventoryLore = new ArrayList<String>();
		riskInventoryLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		riskInventoryMeta.setLore(riskInventoryLore);
		riskInventory.setItemMeta(riskInventoryMeta);
		
		return riskInventory;
	}
	
	public ItemStack riskInventoryDisabled() {
		ItemStack riskInventory = new ItemStack(Material.BONE);
		ItemMeta riskInventoryMeta = riskInventory.getItemMeta();
		
		riskInventoryMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		riskInventoryMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		riskInventoryMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		riskInventoryMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lRisk Inventory"));
		
		ArrayList<String> riskInventoryLore = new ArrayList<String>();
		riskInventoryLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		riskInventoryMeta.setLore(riskInventoryLore);
		riskInventory.setItemMeta(riskInventoryMeta);
		
		return riskInventory;
	}

}
