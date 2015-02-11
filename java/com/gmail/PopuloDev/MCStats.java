package com.gmail.PopuloDev;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Keyboard;

import com.gmail.PopuloDev.event.MCBus;
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

@Mod(modid=MCStats.modid, name="Minecraft Stats", version="1.7.10-0.1")
public class MCStats {

	public static final String modid = "mcstats";
	
	public static int mainMenuConfig;
	public static Minecraft mc = Minecraft.getMinecraft();
	public static KeyBinding[] keyBindings = Client.keyBindings;
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
	public MCLists lists;
	public MCEvents events;
	public EntityPlayer p;
	
	@Instance(value = modid)
	public static MCStats instance;
	
	@SidedProxy(clientSide="com.gmail.PopuloDev.proxy.Client", serverSide="com.gmail.PopuloDev.proxy.Common")
	public static Common proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
		lists = new MCLists(this);
		events = new MCEvents();
		
		
		lists.addLeather();
		lists.addGold();
		lists.addWood();
		lists.addChain();
		lists.addIron();
		lists.addDiamond();
		lists.addStone();
		lists.addSword();
		lists.addPickaxe();
		lists.addShovel();
		lists.addHoe();
		lists.addAxe();
		lists.addHelmet();
		lists.addChestplate();
		lists.addLeggings();
		lists.addBoots();
		lists.addString();
		
	}


	@EventHandler
	public void init(FMLInitializationEvent e) {
		
		keyBindings = new KeyBinding[2];
		
		keyBindings[0] = new KeyBinding("key.statmenu.descMenu", Keyboard.KEY_O, "§a" + "Minecraft Stats");
		keyBindings[1] = new KeyBinding("key.statmenu.descAbility", Keyboard.KEY_P, "§a" + "Minecraft Stats");
		
		ClientRegistry.registerKeyBinding(keyBindings[0]);
		ClientRegistry.registerKeyBinding(keyBindings[1]);
		FMLCommonHandler.instance().bus().register(events);
		MinecraftForge.EVENT_BUS.register(new MCBus());
		
		
	}
}
