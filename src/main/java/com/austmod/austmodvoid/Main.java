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
    public static final String VERSION = "0.3.1";
    public static final String NAME = "AustMod Void";

    public static Logger logger;

    public static Item.ToolMaterial austrone;
    public static Item austroneSword;
    public static Item austronePickaxe;
    public static Item voidResin;
    public static Item austroneIngot;
    public static Item voidEssence;
    public static Item austroneAxe;
    public static Item austroneSpade;
    public static Block voidOre;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        austrone = EnumHelper.addToolMaterial("austrone", 4, 2007, 12.0F, 66.0F, 30);

        austroneSword = new CustomSword(austrone, "austrone_sword");

        voidResin = new CustomMaterial("void_resin");

        austroneIngot = new CustomMaterial("austrone_ingot");

        austrone.setRepairItem(new ItemStack(austroneIngot, 1));

        voidOre = new CustomBlock("void_ore", Material.ROCK, "pickaxe", 3, 55.5f);

        voidEssence = new CustomMaterial("void_essence");

        austronePickaxe = new CustomPickaxe(austrone, "austrone_pickaxe");

        austroneAxe = new CustomAxe(austrone, "austrone_axe");

        austroneSpade = new CustomSpade(austrone, "austrone_shovel");

        GameRegistry.registerWorldGenerator(new OreGeneration(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("This mod has been created by Aust. Enjoy working for that sword?");

        new CustomRecipe(CustomRecipe.RecipeType.Furnace,voidOre, voidEssence, 1, 30.0f);
    }
}
