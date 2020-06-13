package com.austmod.austmodcore;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AustModCore.MODID, name = AustModCore.NAME, version = AustModCore.VERSION)
public class AustModCore
{
    public static final String MODID = "austmodcore";
    public static final String NAME = "AustMod Core";
    public static final String VERSION = "0.1.0";

    public static Logger logger;
    
    public static ToolMaterial austrone;
    public static Item austroneSword;
    public static Item voidResin;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        austrone = EnumHelper.addToolMaterial("austrone", 4, 2007, 12.0F, 40.0F, 30);
        
        austroneSword = new CustomSword(austrone, "austrone_sword");
        
        voidResin = new CustomMaterial("void_resin");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("This mod has been created by Aust.");
    }
}
