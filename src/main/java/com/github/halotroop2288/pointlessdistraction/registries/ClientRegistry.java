package com.github.halotroop2288.pointlessdistraction.registries;

import com.github.halotroop2288.pointlessdistraction.registries.client.RendererRegistry;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientRegistry
{
	@Environment(EnvType.CLIENT)
	public static void registerOnClient()
	{
		RendererRegistry.registerRenderers();
	}
}
