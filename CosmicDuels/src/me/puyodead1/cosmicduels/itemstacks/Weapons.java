package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Weapons {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack weaponsEnabled() {
		ItemStack weapons = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta weaponsMeta = weapons.getItemMeta();
		
		weaponsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		weaponsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		weaponsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		weaponsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lWeapons"));
		
		ArrayList<String> weaponsLore = new ArrayList<String>();
		weaponsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		weaponsMeta.setLore(weaponsLore);
		weapons.setItemMeta(weaponsMeta);
		
		return weapons;
	}
	
	public ItemStack weaponsDisabled() {
		ItemStack weapons = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta weaponsMeta = weapons.getItemMeta();
		
		weaponsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		weaponsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		weaponsMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		weaponsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lWeapons"));
		
		ArrayList<String> weaponsLore = new ArrayList<String>();
		weaponsLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		weaponsMeta.setLore(weaponsLore);
		weapons.setItemMeta(weaponsMeta);
		
		return weapons;
	}

}
