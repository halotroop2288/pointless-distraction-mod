package com.github.halotroop2288.pointlessdistraction.registries;

import com.github.halotroop2288.pointlessdistraction.Cmn;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry
{
	public static Block GAY_BLOCK;
	public static Block TRANS_BLOCK;
	public static Block BI_BLOCK;
	
	public static void registerBlocks()
	{
		GAY_BLOCK = registerBasicBlock("gay_block", Blocks.WHITE_CONCRETE);
		TRANS_BLOCK = registerBasicBlock("trans_block", Blocks.WHITE_CONCRETE);
		TRANS_BLOCK = registerBasicBlock("bi_block", Blocks.WHITE_CONCRETE);
	}
	
	private static Block registerBasicBlock(String name, Block blockToCopy)
	{
		Block block = registerBlock(name, new Block(FabricBlockSettings.copy(blockToCopy).build()));
		registerBlockItem(name, block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
		return block;
	}
	
	private static Block registerBlock(String name, Block entry)
	{
		return Registry.register(Registry.BLOCK, new Identifier(Cmn.MODID, name.toLowerCase()), entry);
	}
	
	private static Item registerBlockItem(String name, Block entry, Item.Settings settings)
	{
		return ItemRegistry.registerItem(name, new BlockItem(entry, settings));
	}
}
