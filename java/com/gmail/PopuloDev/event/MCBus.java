package com.gmail.PopuloDev.event;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import com.gmail.PopuloDev.MCStats;
import com.gmail.PopuloDev.logic.MCMisc;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MCBus {

	private EntityPlayer p;
	private MCStats mod = MCStats.instance;
	private MCMisc misc = MCStats.instance.misc;
	private MCEvents e = mod.instance.events;
	public EntityPlayer pl;
	
	public MCBus() {
		this.p = e.pl;
		this.pl = this.p;
	}
	
	// other events
	// THESE TWO MUST BE IN THESE CLASSES. FORGE IS WIERD 

	//gets block right clicked
	// note: DOES NOT GET CORRECT BLOCK. RETURNS NULL AS BLOCK CLICKED
	@SubscribeEvent
	public void onBlock(PlayerInteractEvent e) {
		ItemStack item = e.entityPlayer.inventory.getCurrentItem();
		Block block = e.entityPlayer.worldObj.getBlock(mod.mc.objectMouseOver.blockX, mod.mc.objectMouseOver.blockY, mod.mc.objectMouseOver.blockZ);
		EntityPlayer p = e.entityPlayer;
		if (item.stackSize == 0) return;
		if (mod.wood.contains(item.getItem())) {
			System.out.println(block.getLocalizedName());
			if (block.equals(Blocks.log)) {
				p.addChatMessage(new ChatComponentText(block.getItemIconName()));
			} else {
				p.addChatMessage(new ChatComponentText(EnumChatFormatting.UNDERLINE + block.getUnlocalizedName()));
			}
		} else {
			System.out.println(item.getDisplayName());
			System.out.println(block.getLocalizedName());
			
		}
		System.out.println(item);
	}
}
