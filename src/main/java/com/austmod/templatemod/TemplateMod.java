package com.austmod.templatemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TemplateMod.MODID, name = TemplateMod.NAME, version = TemplateMod.VERSION)
public class TemplateMod
{
    public static final String MODID = "austmodcore";
    public static final String NAME = "AustMod Core";
    public static final String VERSION = "0.0.1";

    public static Logger logger;
    
    public static ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        myToolMaterial = EnumHelper.addToolMaterial("austrone", 4, 2007, 12.0F, 30.0F, 30);
        
        mySword = new CustomSword(myToolMaterial);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("This mod has been created by Aust.");
    }
}
