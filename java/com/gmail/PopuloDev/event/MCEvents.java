package com.gmail.PopuloDev.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.gmail.PopuloDev.MCStats;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class MCEvents {

	private EntityPlayer p;
	
	public MCEvents(EntityPlayer player) {
		this.p = player;
	}
	
	@SubscribeEvent
	public void onKey(InputEvent.KeyInputEvent e) {
		if (MCStats.mc.isSingleplayer()) {
			if (MCStats.keyBindings[0].isPressed()) {
				p.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "hi"));
			} else if (MCStats.keyBindings[1].isPressed()) {
				System.out.println("pressed");
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {
		
	}
}
