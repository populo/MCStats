package com.gmail.PopuloDev;

import net.minecraft.init.Items;

public class MCLists {

	private final MCStats mod;
	
	public MCLists(MCStats mod) {
		this.mod = mod;
	}
	
	
	public void addLeather() {
		mod.leather.clear();
		mod.leather.add(Items.leather_helmet);
		mod.leather.add(Items.leather_chestplate);
		mod.leather.add(Items.leather_leggings);
		mod.leather.add(Items.leather_boots);
	}
	
	public void addChain() {
		mod.chain.clear();
		mod.chain.add(Items.chainmail_helmet);
		mod.chain.add(Items.chainmail_chestplate);
		mod.chain.add(Items.chainmail_leggings);
		mod.chain.add(Items.chainmail_boots);
	}
	
	public void addIron() {
		mod.iron.clear();
		mod.iron.add(Items.iron_helmet);
		mod.iron.add(Items.iron_chestplate);
		mod.iron.add(Items.iron_leggings);
		mod.iron.add(Items.iron_boots);
		mod.iron.add(Items.iron_sword);
		mod.iron.add(Items.iron_pickaxe);
		mod.iron.add(Items.iron_axe);
		mod.iron.add(Items.iron_hoe);
		mod.iron.add(Items.iron_shovel);
		mod.iron.add(Items.shears);
	}
	
	public void addGold() {
		mod.gold.clear();
		mod.gold.add(Items.golden_helmet);
		mod.gold.add(Items.golden_chestplate);
		mod.gold.add(Items.golden_leggings);
		mod.gold.add(Items.golden_boots);
		mod.gold.add(Items.golden_sword);
		mod.gold.add(Items.golden_pickaxe);
		mod.gold.add(Items.golden_axe);
		mod.gold.add(Items.golden_hoe);
		mod.gold.add(Items.golden_shovel);
	}
	
	public void addDiamond() {
		mod.diamond.clear();
		mod.diamond.add(Items.diamond_helmet);
		mod.diamond.add(Items.diamond_chestplate);
		mod.diamond.add(Items.diamond_leggings);
		mod.diamond.add(Items.diamond_boots);
		mod.diamond.add(Items.diamond_sword);
		mod.diamond.add(Items.diamond_pickaxe);
		mod.diamond.add(Items.diamond_axe);
		mod.diamond.add(Items.diamond_hoe);
		mod.diamond.add(Items.diamond_shovel);
	}
	
	public void addWood() {
		mod.wood.clear();
		mod.wood.add(Items.wooden_sword);
		mod.wood.add(Items.wooden_pickaxe);
		mod.wood.add(Items.wooden_axe);
		mod.wood.add(Items.wooden_hoe);
		mod.wood.add(Items.wooden_shovel);
	}
	
	public void addStone() {
		mod.stone.clear();
		mod.stone.add(Items.stone_axe);
		mod.stone.add(Items.stone_hoe);
		mod.stone.add(Items.stone_pickaxe);
		mod.stone.add(Items.stone_shovel);
		mod.stone.add(Items.stone_sword);
	}
	
	public void addSword() {
		mod.sword.clear();
		mod.sword.add(Items.diamond_sword);
		mod.sword.add(Items.iron_sword);
		mod.sword.add(Items.wooden_sword);
		mod.sword.add(Items.golden_sword);
		mod.sword.add(Items.stone_sword);
	}
	
	public void addHoe() {
		mod.hoe.clear();
		mod.hoe.add(Items.diamond_hoe);
		mod.hoe.add(Items.iron_hoe);
		mod.hoe.add(Items.wooden_hoe);
		mod.hoe.add(Items.golden_hoe);
		mod.hoe.add(Items.stone_hoe);
	}
	
	public void addPickaxe() {
		mod.pickaxe.clear();
		mod.pickaxe.add(Items.diamond_pickaxe);
		mod.pickaxe.add(Items.iron_pickaxe);
		mod.pickaxe.add(Items.wooden_pickaxe);
		mod.pickaxe.add(Items.golden_pickaxe);
		mod.pickaxe.add(Items.stone_pickaxe);
	}
	
	public void addShovel() {
		mod.shovel.clear();
		mod.shovel.add(Items.diamond_shovel);
		mod.shovel.add(Items.iron_shovel);
		mod.shovel.add(Items.wooden_shovel);
		mod.shovel.add(Items.golden_shovel);
		mod.shovel.add(Items.stone_shovel);
	}
	
	public void addAxe() {
		mod.axe.clear();
		mod.axe.add(Items.diamond_axe);
		mod.axe.add(Items.iron_axe);
		mod.axe.add(Items.wooden_axe);
		mod.axe.add(Items.golden_axe);
		mod.axe.add(Items.stone_hoe);
	}
	
	public void addHelmet() {
		mod.helmet.clear();
		mod.helmet.add(Items.diamond_helmet);
		mod.helmet.add(Items.iron_helmet);
		mod.helmet.add(Items.leather_helmet);
		mod.helmet.add(Items.golden_helmet);
		mod.helmet.add(Items.chainmail_helmet);
	}
	
	public void addChestplate() {
		mod.chestplate.clear();
		mod.chestplate.add(Items.diamond_chestplate);
		mod.chestplate.add(Items.iron_chestplate);
		mod.chestplate.add(Items.leather_chestplate);
		mod.chestplate.add(Items.golden_chestplate);
		mod.chestplate.add(Items.chainmail_chestplate);
	}
	
	public void addLeggings() {
		mod.leggings.clear();
		mod.leggings.add(Items.diamond_leggings);
		mod.leggings.add(Items.iron_leggings);
		mod.leggings.add(Items.leather_leggings);
		mod.leggings.add(Items.golden_leggings);
		mod.leggings.add(Items.chainmail_leggings);
	}
	
	public void addBoots() {
		mod.boots.clear();
		mod.boots.add(Items.diamond_boots);
		mod.boots.add(Items.iron_boots);
		mod.boots.add(Items.leather_boots);
		mod.boots.add(Items.golden_boots);
		mod.boots.add(Items.chainmail_boots);
	}

	public void addString() {
		mod.string.clear();
		mod.string.add(Items.bow);
		mod.string.add(Items.fishing_rod);
	}
}
