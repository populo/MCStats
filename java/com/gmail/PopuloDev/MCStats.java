package com.gmail.PopuloDev;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import org.lwjgl.input.Keyboard;

import com.gmail.PopuloDev.event.MCEvents;
import com.gmail.PopuloDev.proxy.Client;
import com.gmail.PopuloDev.proxy.Common;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=MCStats.modid, name="Minecraft Stats", version="1.7.10-1.0")
public class MCStats {

	public static final String modid = "mcstats";
	
	public static int mainMenuConfig;
	public static Minecraft mc = Minecraft.getMinecraft();
	public static KeyBinding[] keyBindings = Client.keyBindings;
	public static ArrayList<Item> leather, gold, wood, chain, iron, diamond, stone, sword, pickaxe, shovel, hoe, helmet, chestplate, leggings, boots;
	public static ArrayList<Block> woodBlock, diamondBlock, ironBlock, goldBlock, ;
	MCEvents event = new MCEvents();
	
	@Instance(value = modid)
	public static MCStats instance;
	
	@SidedProxy(clientSide="com.gmail.PopuloDev.proxy.Client", serverSide="com.gmail.PopuloDev.proxy.Common")
	public static Common proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		if (!leather.contains(Items.leather_helmet)) MCLists.addLeather();
		if (!gold.contains(Items.golden_helmet)) MCLists.addGold();
		if (!wood.contains(Items.wooden_axe)) MCLists.addWood();
		if (!chain.contains(Items.chainmail_helmet)) MCLists.addChain();
		if (!iron.contains(Items.iron_helmet)) MCLists.addIron();
		if (!diamond.contains(Items.diamond_helmet)) MCLists.addDiamond();
		if (!stone.contains(Items.stone_pickaxe)) MCLists.addStone();
		if (!sword.contains(Items.diamond_sword)) MCLists.addSword();
		if (!pickaxe.contains(Items.diamond_pickaxe)) MCLists.addPickaxe();
		if (!shovel.contains(Items.diamond_shovel)) MCLists.addShovel();
		if (!hoe.contains(Items.diamond_hoe)) MCLists.addHoe();
		if (!helmet.contains(Items.diamond_helmet)) MCLists.addHelmet();
		if (!chestplate.contains(Items.diamond_chestplate)) MCLists.addChestplate();
		if (!leggings.contains(Items.diamond_leggings)) MCLists.addLeggings();
		if (!boots.contains(Items.diamond_boots)) MCLists.addBoots();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
		keyBindings = new KeyBinding[2];
		
		keyBindings[0] = new KeyBinding("key.statmenu.descMenu", Keyboard.KEY_O, "§a" + "Minecraft Stats");
		keyBindings[1] = new KeyBinding("key.statmenu.descAbility", Keyboard.KEY_P, "§a" + "Minecraft Stats");
		
		ClientRegistry.registerKeyBinding(keyBindings[0]);
		ClientRegistry.registerKeyBinding(keyBindings[1]);
		FMLCommonHandler.instance().bus().register(event);
		
		
	}
}
