package com.gmail.PopuloDev.logic;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.gmail.PopuloDev.MCStats;

public class MCMisc {

	static MCStats mod = new MCStats();
	static Random rand = new Random();
	
	public static boolean isRepairable(Item i) {
		return isLeather(i) || isIron(i) || isGold(i) || isDiamond(i) || isString(i) || isWood(i) || isStone(i) || isChain(i);
	}
	
	public static boolean isLeather(Item i) {
		return mod.leather.contains(i);
	}

	public static boolean isIron(Item i) {
		return mod.iron.contains(i);
	}

	public static boolean isGold(Item i) {
		return mod.gold.contains(i);
	}

	public static boolean isDiamond(Item i) {
		return mod.diamond.contains(i);
	}

	public static boolean isWood(Item i) {
		return mod.wood.contains(i);
	}

	public static boolean isStone(Item i) {
		return mod.stone.contains(i);
	}

	public static boolean isString(Item i) {
		return mod.string.contains(i);
	}

	public static boolean isChain(Item i) {
		return mod.chain.contains(i);
	}

	public static boolean isShovel(Item i) {
		return mod.shovel.contains(i);
	}

	public static boolean isSword(Item i) {
		return mod.sword.contains(i);
	}

	public static boolean isHoe(Item i) {
		return mod.hoe.contains(i);
	}

	public static boolean isPick(Item i) {
		return mod.pickaxe.contains(i);
	}

	public static boolean isAxe(Item i) {
		return mod.axe.contains(i);
	}

	public static boolean isHelmet(Item i) {
		return mod.helmet.contains(i);
	}

	public static boolean isChestplate(Item i) {
		return mod.chestplate.contains(i);
	}

	public static boolean isLeggings(Item i) {
		return mod.leggings.contains(i);
	}

	public static boolean isBoots(Item i) {
		return mod.boots.contains(i);
	}
	
	public static float getSwimmingSpeedBoost()	{
		//float boost = Stat.getSkillLevel("Swimming") / 10 / 60f;
		//return boost > 0 ? boost : 0;
		return 0;
	}
	//repairs
	
	public static void repairCurrentItem(float levelAddedRepairFactor) {
		//if (levelAddedRepairFactor == 0) levelAddedRepairFactor = (float)Math.sqrt(Stat.getSkillLevel("Repair") / 10);
		
		int curDamage = mod.mc.thePlayer.inventory.getCurrentItem().getItemDamage();
		int maxDamage = mod.mc.thePlayer.inventory.getCurrentItem().getMaxDamage();
		Item item = mod.mc.thePlayer.inventory.getCurrentItem().getItem();
		
		byte itemMaterialCount = 1;
		byte xp = 0;
		
		if (item == Items.fishing_rod || item == Items.shears) itemMaterialCount = 2;
		else if (item == Items.bow) itemMaterialCount = 3;
		else if (isPick(item)) itemMaterialCount = 3;
		else if (isShovel(item)) itemMaterialCount = 1;
		else if (isHoe(item)) itemMaterialCount = 2;
		else if (isAxe(item)) itemMaterialCount = 3;
		else if (isSword(item)) itemMaterialCount = 2;
		else if (isHelmet(item)) itemMaterialCount = 5;
		else if (isChestplate(item)) itemMaterialCount = 8;
		else if (isLeggings(item)) itemMaterialCount = 7;
		else if (isBoots(item)) itemMaterialCount = 4;
		
		int repairAmount = (int) (maxDamage / itemMaterialCount * (1 + levelAddedRepairFactor));
		if (curDamage - repairAmount < 0) mod.mc.thePlayer.inventory.getCurrentItem().setItemDamage(0);
		else mod.mc.thePlayer.inventory.getCurrentItem().setItemDamage(curDamage - repairAmount);
		
		String string;
		switch(rand.nextInt(7)) {
		case 0: string = "Reparo!"; break;
		case 1: string = "Abracadabra!"; break;
		case 2: string = "Viola!"; break;
		case 3 : string = "Dun dun DUN!!!"; break;
		case 4 : string = "Yes he can!"; break;
		case 5 : string = "Episkey!"; break;
		case 6 : string = "BANG!"; break;
		default: string = "";
		}
		
		if (isWood(item)) xp = 5;
		else if (isLeather(item)) xp = 5;
		else if (isString(item)) xp = 8;
		else if (isStone(item)) xp = 15;
		else if (isIron(item)) xp = 30;
		else if (isGold(item)) xp = 40;
		else if (isDiamond(item)) xp = 60;
		else if (isChain(item)) xp = 80;
		mod.mc.thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + string));
		//Stat.addExperience(Stat.REPAIR, xp+repairAmount/5000);
	}
}
