package com.austmod.austmodvoid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	public CustomSword(ToolMaterial material, String name) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}

}
