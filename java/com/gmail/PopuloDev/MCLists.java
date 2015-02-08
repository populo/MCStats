package com.gmail.PopuloDev;

import net.minecraft.init.Items;

public class MCLists {

	private final MCStats mod;
	
	public MCLists(MCStats mod) {
		this.mod = mod;
	}
	
	
	public void addLeather() {
		mod.leather.add(Items.leather_helmet);
		mod.leather.add(Items.leather_chestplate);
		mod.leather.add(Items.leather_leggings);
		mod.leather.add(Items.leather_boots);
	}
	
	public void addChain() {
		mod.chain.add(Items.chainmail_helmet);
		mod.chain.add(Items.chainmail_chestplate);
		mod.chain.add(Items.chainmail_leggings);
		mod.chain.add(Items.chainmail_boots);
	}
	
	public void addIron() {
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
		mod.wood.add(Items.wooden_sword);
		mod.wood.add(Items.wooden_pickaxe);
		mod.wood.add(Items.wooden_axe);
		mod.wood.add(Items.wooden_hoe);
		mod.wood.add(Items.wooden_shovel);
	}
	
	public void addStone() {
		mod.stone.add(Items.stone_axe);
		mod.stone.add(Items.stone_hoe);
		mod.stone.add(Items.stone_pickaxe);
		mod.stone.add(Items.stone_shovel);
		mod.stone.add(Items.stone_sword);
	}
	
	public void addSword() {
		mod.sword.add(Items.diamond_sword);
		mod.sword.add(Items.iron_sword);
		mod.sword.add(Items.wooden_sword);
		mod.sword.add(Items.golden_sword);
		mod.sword.add(Items.stone_sword);
	}
	
	public void addHoe() {
		mod.hoe.add(Items.diamond_hoe);
		mod.hoe.add(Items.iron_hoe);
		mod.hoe.add(Items.wooden_hoe);
		mod.hoe.add(Items.golden_hoe);
		mod.hoe.add(Items.stone_hoe);
	}
	
	public void addPickaxe() {
		mod.pickaxe.add(Items.diamond_pickaxe);
		mod.pickaxe.add(Items.iron_pickaxe);
		mod.pickaxe.add(Items.wooden_pickaxe);
		mod.pickaxe.add(Items.golden_pickaxe);
		mod.pickaxe.add(Items.stone_pickaxe);
	}
	
	public void addShovel() {
		mod.shovel.add(Items.diamond_shovel);
		mod.shovel.add(Items.iron_shovel);
		mod.shovel.add(Items.wooden_shovel);
		mod.shovel.add(Items.golden_shovel);
		mod.shovel.add(Items.stone_shovel);
	}
	
	public void addAxe() {
		mod.axe.add(Items.diamond_axe);
		mod.axe.add(Items.iron_axe);
		mod.axe.add(Items.wooden_axe);
		mod.axe.add(Items.golden_axe);
		mod.axe.add(Items.stone_hoe);
	}
	
	public void addHelmet() {
		mod.helmet.add(Items.diamond_helmet);
		mod.helmet.add(Items.iron_helmet);
		mod.helmet.add(Items.leather_helmet);
		mod.helmet.add(Items.golden_helmet);
		mod.helmet.add(Items.chainmail_helmet);
	}
	
	public void addChestplate() {
		mod.chestplate.add(Items.diamond_chestplate);
		mod.chestplate.add(Items.iron_chestplate);
		mod.chestplate.add(Items.leather_chestplate);
		mod.chestplate.add(Items.golden_chestplate);
		mod.chestplate.add(Items.chainmail_chestplate);
	}
	
	public void addLeggings() {
		mod.leggings.add(Items.diamond_leggings);
		mod.leggings.add(Items.iron_leggings);
		mod.leggings.add(Items.leather_leggings);
		mod.leggings.add(Items.golden_leggings);
		mod.leggings.add(Items.chainmail_leggings);
	}
	
	public void addBoots() {
		mod.boots.add(Items.diamond_boots);
		mod.boots.add(Items.iron_boots);
		mod.boots.add(Items.leather_boots);
		mod.boots.add(Items.golden_boots);
		mod.boots.add(Items.chainmail_boots);
	}
	/*
	public void addWoodBlocks() {
		mod.woodBlock.add(Blocks.log);
		mod.woodBlock.add(Blocks.log2);
		mod.woodBlock.add(Blocks.wooden_button);
		mod.woodBlock.add(Blocks.wooden_door);
		mod.woodBlock.add(Blocks.wooden_slab);
		mod.woodBlock.add(Blocks.acacia_stairs);
		mod.woodBlock.add(Blocks.oak_stairs);
		mod.woodBlock.add(Blocks.jungle_stairs);
		mod.woodBlock.add(Blocks.dark_oak_stairs);
		mod.woodBlock.add(Blocks.birch_stairs);
		mod.woodBlock.add(Blocks.spruce_stairs);
		mod.woodBlock.add(Blocks.crafting_table);
		mod.woodBlock.add(Blocks.bed);
		mod.woodBlock.add(Blocks.chest);
	}
	
	public void addStoneBlock() {
		mod.stoneBlock.add(Blocks.stone);
		mod.stoneBlock.add(Blocks.stone_brick_stairs);
		mod.stoneBlock.add(Blocks.stone_button);
		mod.stoneBlock.add(Blocks.stone_pressure_plate);
		mod.stoneBlock.add(Blocks.stone_stairs);
		mod.stoneBlock.add(Blocks.stonebrick);
		mod.stoneBlock.add(Blocks.stone_slab);
		mod.stoneBlock.add(Blocks.furnace);
		mod.stoneBlock.add(Blocks.brick_block);
		mod.stoneBlock.add(Blocks.brick_stairs);
		mod.stoneBlock.add(Blocks.cobblestone);
		mod.stoneBlock.add(Blocks.cobblestone_wall);
		mod.stoneBlock.add(Blocks.obsidian);
		mod.stoneBlock.add(Blocks.sandstone);
		mod.stoneBlock.add(Blocks.sandstone_stairs);
		mod.stoneBlock.add(Blocks.iron_ore);
		mod.stoneBlock.add(Blocks.iron_block);
		mod.stoneBlock.add(Blocks.gold_ore);
		mod.stoneBlock.add(Blocks.gold_block);
		mod.stoneBlock.add(Blocks.diamond_ore);
		mod.stoneBlock.add(Blocks.diamond_block);
		mod.stoneBlock.add(Blocks.coal_ore);
		mod.stoneBlock.add(Blocks.coal_block);
		mod.stoneBlock.add(Blocks.emerald_ore);
		mod.stoneBlock.add(Blocks.emerald_block);
	}
	*/
	public void addString() {
		mod.string.add(Items.bow);
		mod.string.add(Items.fishing_rod);
	}
}
