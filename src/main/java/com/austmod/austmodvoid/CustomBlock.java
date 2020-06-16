package com.austmod.austmodvoid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class CustomBlock extends Block {

	public CustomBlock(String name, Material material, String toolClass, int harvestLevel, float hardness) {
		
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
