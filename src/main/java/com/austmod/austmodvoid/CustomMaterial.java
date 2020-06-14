package com.austmod.austmodvoid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class CustomMaterial extends Item {

	public CustomMaterial(String name) {
		// TODO Auto-generated constructor stub
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.MISC);
	}
}
