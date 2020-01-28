package com.github.halotroop2288.pointlessdistraction;

import com.github.halotroop2288.pointlessdistraction.registries.CommonRegistry;

import net.fabricmc.api.ModInitializer;

public class DistractionMod implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		CommonRegistry.registerEverything();
	}
}
