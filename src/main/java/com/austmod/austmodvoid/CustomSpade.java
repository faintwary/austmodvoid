package com.austmod.austmodvoid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CustomSpade extends ItemSpade
{
    public CustomSpade(ToolMaterial material, String name)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
