package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GlassPane {

	public static ArrayList<String> paneLore;
	public static String goldenAppleStat = "§a§lON";
	public static String mcmmoStat = "§a§lON";
	public static String potionsStat = "§a§lON";
	public static String bowStat = "§a§lON";
	public static String healingStat = "§a§lON";
	public static String foodLossStat = "§a§lON";
	public static String enderPearlsStat = "§a§lON";
	public static String riskInventoryStat = "§a§lON";
	public static String bountyStat = "§a§lON";
	public static String armorStat = "§a§lON";
	public static String weaponsStat = "§a§lON";

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
		paneLore.addAll(Arrays.asList(" ", "§eGolden Apples: " + goldenAppleStat, "§eMCMMO: " + mcmmoStat,
				"§ePotions: " + potionsStat, "§eBows: " + bowStat, "§eHealing: " + healingStat,
				"§eFood Loss: " + foodLossStat, "§eEnder Pearls: " + enderPearlsStat,
				"§eRisk Inventory: " + riskInventoryStat, "§eBounty: " + bountyStat, "§eArmor: " + armorStat, "§eWeapons: " + weaponsStat));

		paneMeta.setLore(paneLore);

		pane.setItemMeta(paneMeta);
		return pane;
	}

}
