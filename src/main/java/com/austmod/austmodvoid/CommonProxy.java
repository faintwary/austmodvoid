package com.austmod.austmodvoid;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Main.austroneSword);
		registerRender(Main.voidResin);
		registerRender(Main.austroneIngot);
		registerRender(Item.getItemFromBlock(Main.voidOre));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(Main.austroneSword);
		event.getRegistry().registerAll(Main.voidResin);
		event.getRegistry().registerAll(Main.austroneIngot);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
	  event.getRegistry().registerAll(Main.voidOre);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
	  event.getRegistry().registerAll(new ItemBlock(Main.voidOre).setRegistryName(Main.voidOre.getRegistryName()));
	}
}