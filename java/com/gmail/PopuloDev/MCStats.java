package com.gmail.PopuloDev;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

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
	MCEvents event = new MCEvents();
	
	@Instance(value = modid)
	public static MCStats instance;
	
	@SidedProxy(clientSide="com.gmail.PopuloDev.proxy.Client", serverSide="com.gmail.PopuloDev.proxy.Common")
	public static Common proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
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
