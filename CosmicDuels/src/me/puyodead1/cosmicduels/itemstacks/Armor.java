package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Armor {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack armorEnabled() {
		ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta armorMeta = armor.getItemMeta();
		
		armorMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		armorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		armorMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		armorMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lArmor"));
		
		ArrayList<String> armorLore = new ArrayList<String>();
		armorLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		armorMeta.setLore(armorLore);
		armor.setItemMeta(armorMeta);
		
		return armor;
	}
	
	public ItemStack armorDisabled() {
		ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta armorMeta = armor.getItemMeta();
		
		armorMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		armorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		armorMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		armorMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lArmor"));
		
		ArrayList<String> armorLore = new ArrayList<String>();
		armorLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		armorMeta.setLore(armorLore);
		armor.setItemMeta(armorMeta);
		
		return armor;
	}

}
