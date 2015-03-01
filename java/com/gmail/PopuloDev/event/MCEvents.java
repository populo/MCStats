package com.gmail.PopuloDev.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.gmail.PopuloDev.MCStats;
import com.gmail.PopuloDev.logic.MCMisc;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class MCEvents {

	
	private EntityPlayer p;
	private MCStats mod = MCStats.instance;
	private MCMisc misc = new MCMisc();
	public EntityPlayer pl;

	@SubscribeEvent
	public void onJoin(PlayerLoggedInEvent e) {
		this.p = e.player;
		this.pl = p;
		mod.p = this.p;
		// used for testing for player variables
		p.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Welcome " + p.getDisplayName()));
	}

	// on key press (works)
	@SubscribeEvent
	public void onKey(InputEvent.KeyInputEvent e) {
		if (MCStats.mc.isSingleplayer()) {
			if (MCStats.keyBindings[0].isPressed()) {
				p.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "hi"));
			} else if (MCStats.keyBindings[1].isPressed()) {
				if(!mod.string.isEmpty())
					for(Item i : mod.string) {
						p.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW + i.getItemStackDisplayName(new ItemStack(i))));
					}
				else
					p.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "empty"));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent e) {

	}
}
