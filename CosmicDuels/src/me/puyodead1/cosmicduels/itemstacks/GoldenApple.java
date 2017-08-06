package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GoldenApple {
	
	public static String lore = "§a§lENABLED";
	
	public ItemStack goldenAppleEnabled() {
		ItemStack goldenApple = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta goldenAppleMeta = goldenApple.getItemMeta();
		goldenAppleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		goldenAppleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		goldenAppleMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, false);
		
		goldenAppleMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lGolden Apples"));

		ArrayList<String> goldenAppleLore = new ArrayList<String>();
		goldenAppleLore.addAll(Arrays.asList(lore, "", "§7Click to §7§ntoggle§7 this setting."));
		goldenAppleMeta.setLore(goldenAppleLore);

		goldenApple.setItemMeta(goldenAppleMeta);
		return goldenApple;
	}
	
	public ItemStack goldenAppleDisabled() {
		ItemStack goldenApple = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta goldenAppleMeta = goldenApple.getItemMeta();
		goldenAppleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		goldenAppleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		goldenAppleMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, false);
		
		goldenAppleMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lGolden Apples"));

		ArrayList<String> goldenAppleLore = new ArrayList<String>();
		goldenAppleLore.addAll(Arrays.asList(lore, "",  "§7Click to §7§ntoggle§7 this setting."));
		goldenAppleMeta.setLore(goldenAppleLore);

		goldenApple.setItemMeta(goldenAppleMeta);
		return goldenApple;
	}

}
