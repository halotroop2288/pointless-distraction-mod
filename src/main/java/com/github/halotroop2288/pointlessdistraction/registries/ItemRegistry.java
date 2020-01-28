package com.github.halotroop2288.pointlessdistraction.registries;

import com.github.halotroop2288.pointlessdistraction.Cmn;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry
{
	public static void registerItems()
	{
		
	}
	
	public static Item registerItem(String name, Item entry)
	{
		return Registry.register(Registry.ITEM, new Identifier(Cmn.MODID, name), entry);
	}
}
