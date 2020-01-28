package com.github.halotroop2288.pointlessdistraction.registries;

import com.github.halotroop2288.pointlessdistraction.Cmn;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry
{
	public static void registerBlocks()
	{
		
	}

	private static void registerBlockAndItem(String name, Block entry, Item.Settings settings)
	{
		registerBlock(name, entry);
		registerBlockItem(name, entry, settings);
	}
	
	private static Block registerBlock(String name, Block entry)
	{
		return Registry.register(Registry.BLOCK, new Identifier(Cmn.MODID, name), entry);
	}
	
	private static Item registerBlockItem(String name, Block entry, Item.Settings settings)
	{
		return ItemRegistry.registerItem(name, new BlockItem(registerBlock(name, entry), settings));
	}
	
}
