package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GlassPane {
	
	public static ArrayList<String> paneLore;
	public static String stat = "§a§lON";
	
	public ItemStack grayGlassPane() {
		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 7);
		ItemMeta paneMeta = pane.getItemMeta();
		
		paneMeta.setDisplayName(" ");
		pane.setItemMeta(paneMeta);
		return pane;
	}
	
	public ItemStack greenGlassPane() {
		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 13);
		ItemMeta paneMeta = pane.getItemMeta();
		
		paneMeta.setDisplayName("§e§lConfirm Settings");
		paneLore = new ArrayList<String>();
		paneLore.addAll(Arrays.asList(" ", "§eGolden Apples: " + stat));
		
		paneMeta.setLore(paneLore);
		
		pane.setItemMeta(paneMeta);
		return pane;
	}

}
