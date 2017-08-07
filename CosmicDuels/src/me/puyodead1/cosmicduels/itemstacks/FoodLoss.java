package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class FoodLoss {
public static String lore = "§a§lENABLED";
	
	public ItemStack foodLossEnabled() {
		ItemStack foodLoss = new ItemStack(Material.COOKED_BEEF);
		ItemMeta foodLossMeta = foodLoss.getItemMeta();
		
		foodLossMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		foodLossMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		foodLossMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		foodLossMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lFood Loss"));
		
		ArrayList<String> foodLossLore = new ArrayList<String>();
		foodLossLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		foodLossMeta.setLore(foodLossLore);
		foodLoss.setItemMeta(foodLossMeta);
		
		return foodLoss;
	}
	
	public ItemStack foodLossDisabled() {
		ItemStack foodLoss = new ItemStack(Material.COOKED_BEEF);
		ItemMeta foodLossMeta = foodLoss.getItemMeta();
		
		foodLossMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		foodLossMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		foodLossMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		foodLossMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lFood Loss"));
		
		ArrayList<String> foodLossLore = new ArrayList<String>();
		foodLossLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		foodLossMeta.setLore(foodLossLore);
		foodLoss.setItemMeta(foodLossMeta);
		
		return foodLoss;
	}

}
