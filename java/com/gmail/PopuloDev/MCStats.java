package com.gmail.PopuloDev;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Keyboard;

import com.gmail.PopuloDev.event.MCBus;
import com.gmail.PopuloDev.event.MCEvents;
import com.gmail.PopuloDev.logic.MCMisc;
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

@Mod(modid=MCStats.modid, name="Minecraft Stats", version="1.7.10-0.1")
public class MCStats {

	public static final String modid = "mcstats";

	//int for guiID I believe (followed variables from original)
	public static int mainMenuConfig;
	// minecraft
	public static Minecraft mc = Minecraft.getMinecraft();
	// keybindings
	public static KeyBinding[] keyBindings = Client.keyBindings;
	// arraylists of items for categorization (might be more than necessary)
	public ArrayList<Item> leather = new ArrayList<Item>(),
			gold = new ArrayList<Item>(),
			wood = new ArrayList<Item>(),
			chain = new ArrayList<Item>(),
			iron = new ArrayList<Item>(),
			diamond = new ArrayList<Item>(),
			stone = new ArrayList<Item>(),
			sword = new ArrayList<Item>(),
			pickaxe = new ArrayList<Item>(),
			shovel = new ArrayList<Item>(),
			hoe = new ArrayList<Item>(),
			axe = new ArrayList<Item>(),
			helmet = new ArrayList<Item>(),
			chestplate = new ArrayList<Item>(),
			leggings = new ArrayList<Item>(),
			boots = new ArrayList<Item>(),
			string = new ArrayList<Item>();
	// extra classes used to keep main class organized
	public MCLists lists;
	public MCEvents events;
	public EntityPlayer p;
	public MCMisc misc;

	// instance
	@Instance(value = modid)
	public static MCStats instance;

	// proxies
	@SidedProxy(clientSide="com.gmail.PopuloDev.proxy.Client", serverSide="com.gmail.PopuloDev.proxy.Common")
	public static Common proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
// instantiates classes, lists takes the mod as argument
		lists = new MCLists(this.instance);
		events = new MCEvents();
		misc = new MCMisc();


		if(!leather.contains(Items.leather_helmet)) lists.addLeather();
		if(!gold.contains(Items.golden_helmet)) lists.addGold();
		if(!wood.contains(Items.wooden_sword)) lists.addWood();
		if(!chain.contains(Items.chainmail_helmet)) lists.addChain();
		if(!iron.contains(Items.iron_helmet)) lists.addIron();
		if(!diamond.contains(Items.diamond_helmet)) lists.addDiamond();
		if(!stone.contains(Items.stone_sword)) lists.addStone();
		if(!sword.contains(Items.diamond_sword)) lists.addSword();
		if(!pickaxe.contains(Items.diamond_pickaxe)) lists.addPickaxe();
		if(!shovel.contains(Items.diamond_shovel)) lists.addShovel();
		if(!hoe.contains(Items.diamond_hoe)) lists.addHoe();
		if(!axe.contains(Items.diamond_axe)) lists.addAxe();
		if(!helmet.contains(Items.diamond_helmet)) lists.addHelmet();
		if(!chestplate.contains(Items.diamond_chestplate)) lists.addChestplate();
		if(!leggings.contains(Items.diamond_leggings)) lists.addLeggings();
		if(!boots.contains(Items.diamond_boots)) lists.addBoots();
		if(!string.contains(Items.bow)) lists.addString();

	}


	@EventHandler
	public void init(FMLInitializationEvent e) {

		keyBindings = new KeyBinding[2];

		// sets keybindings (String name, Keyboard key, String section title)
		keyBindings[0] = new KeyBinding("key.statmenu.descMenu", Keyboard.KEY_O, "�a" + "Minecraft Stats");
		keyBindings[1] = new KeyBinding("key.statmenu.descAbility", Keyboard.KEY_P, "�a" + "Minecraft Stats");

		// registers keybindings
		ClientRegistry.registerKeyBinding(keyBindings[0]);
		ClientRegistry.registerKeyBinding(keyBindings[1]);
		// event registers
		FMLCommonHandler.instance().bus().register(events);
		MinecraftForge.EVENT_BUS.register(new MCBus());


	}
}
