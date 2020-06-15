package com.austmod.austmodvoid;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomRecipe {
	
	public enum RecipeType {
		Furnace
	}
	
	public CustomRecipe(RecipeType type, Item input, Item output, int count, float experienceOut)
	{
		if (type == RecipeType.Furnace)
			GameRegistry.addSmelting(input, new ItemStack(output, count), experienceOut);
	}
	
	public CustomRecipe(RecipeType type, Block input, Item output, int count, float experienceOut)
	{
		if (type == RecipeType.Furnace)
			GameRegistry.addSmelting(input, new ItemStack(output, count), experienceOut);
	}
}
