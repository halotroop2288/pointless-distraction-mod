package com.github.halotroop2288.pointlessdistraction.registries;

import com.github.halotroop2288.pointlessdistraction.Cmn;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry
{
	public static void registerEntities()
	{
		
	}
	
	private static void registerEntity(String name, EntityType<?> entry)
	{
		Registry.register(Registry.ENTITY_TYPE, new Identifier(Cmn.MODID, name), entry);
	}
}
