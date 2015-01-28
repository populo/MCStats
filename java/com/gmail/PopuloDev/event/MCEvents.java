package com.gmail.PopuloDev.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.gmail.PopuloDev.MCStats;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class MCEvents {

	Minecraft mc = MCStats.mc;
	World world = mc.theWorld;
	EntityClientPlayerMP p = mc.thePlayer;
	
	@SubscribeEvent
	public void onKey(InputEvent.KeyInputEvent e) {
		if (MCStats.mc.isSingleplayer()) {
			if (MCStats.keyBindings[0].isPressed()) {
				p.capabilities.setPlayerWalkSpeed(200F);
				p.addChatMessage(new ChatComponentText("" + p.capabilities.getWalkSpeed()));
			} else if (MCStats.keyBindings[1].isPressed()) {
				System.out.println("pressed");
			}
		}
	}
}
