package com.austmod.templatemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	public CustomSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName("my_sword");
		this.setUnlocalizedName("my_sword");
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

}
