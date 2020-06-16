package com.austmod.austmodvoid;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe {

    public CustomAxe(ToolMaterial material, String name) {
            super(material, material.getAttackDamage(), 1.0F);
            this.setRegistryName(name);
            this.setUnlocalizedName(name);
            this.setCreativeTab(CreativeTabs.TOOLS);
    }
}
