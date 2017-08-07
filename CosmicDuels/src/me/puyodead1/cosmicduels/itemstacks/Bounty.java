package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Bounty {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack bountyEnabled() {
		ItemStack bounty = new ItemStack(Material.GOLD_INGOT);
		ItemMeta bountyMeta = bounty.getItemMeta();
		
		bountyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bountyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		bountyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		bountyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lBounty"));
		
		ArrayList<String> bountyLore = new ArrayList<String>();
		bountyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		bountyMeta.setLore(bountyLore);
		bounty.setItemMeta(bountyMeta);
		
		return bounty;
	}
	
	public ItemStack bountyDisabled() {
		ItemStack bounty = new ItemStack(Material.GOLD_INGOT);
		ItemMeta bountyMeta = bounty.getItemMeta();
		
		bountyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bountyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		bountyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		bountyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lBounty"));
		
		ArrayList<String> bountyLore = new ArrayList<String>();
		bountyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		bountyMeta.setLore(bountyLore);
		bounty.setItemMeta(bountyMeta);
		
		return bounty;
	}

}
