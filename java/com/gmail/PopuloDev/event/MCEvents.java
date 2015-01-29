package com.gmail.PopuloDev.event;

import com.gmail.PopuloDev.MCStats;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class MCEvents {


	@SubscribeEvent
	public void onKey(InputEvent.KeyInputEvent e) {
		if (MCStats.mc.isSingleplayer()) {
			if (MCStats.keyBindings[0].isPressed()) {
				System.out.println("pressed");
			} else if (MCStats.keyBindings[1].isPressed()) {
				System.out.println("pressed");
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {
		
	}
}
