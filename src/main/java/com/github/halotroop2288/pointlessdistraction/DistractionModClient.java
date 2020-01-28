package com.github.halotroop2288.pointlessdistraction;

import com.github.halotroop2288.pointlessdistraction.registries.ClientRegistry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class DistractionModClient implements ClientModInitializer
{
	@Override
	@Environment(EnvType.CLIENT)
	public void onInitializeClient()
	{
		ClientRegistry.registerOnClient();
	}	
}
