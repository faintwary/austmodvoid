package com.austmod.austmodvoid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "austmodvoid";
    public static final String VERSION = "0.2.0";
    public static final String NAME = "AustMod Void";

    public static Logger logger;

    public static Item.ToolMaterial austrone;
    public static Item austroneSword;
    public static Item voidResin;
    public static Item austroneIngot;
    public static Block voidOre;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        austrone = EnumHelper.addToolMaterial("austrone", 4, 2007, 12.0F, 116.0F, 30);

        austroneSword = new CustomSword(austrone, "austrone_sword");

        voidResin = new CustomMaterial("void_resin");

        austroneIngot = new CustomMaterial("austrone_ingot");

        voidOre = new CustomBlock("void_ore", Material.ROCK);

        voidOre.setHarvestLevel("pickaxe", 3);

        voidOre.setHardness(55.0f);

        GameRegistry.registerWorldGenerator(new OreGeneration(), 3);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("This mod has been created by Aust. Enjoy working for that sword?");

        GameRegistry.addSmelting(voidOre, new ItemStack(voidResin, 1), 10.0f);
    }
}
