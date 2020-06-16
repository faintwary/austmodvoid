package com.austmod.austmodvoid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe {

    public CustomAxe(ToolMaterial material, String name) {
            super(material, material.getAttackDamage(), -2.6F);
            this.setRegistryName(name);
            this.setUnlocalizedName(name);
            this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
