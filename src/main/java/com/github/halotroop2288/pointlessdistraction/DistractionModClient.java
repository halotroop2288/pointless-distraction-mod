package com.github.halotroop2288.pointlessdistraction;

import com.github.halotroop2288.pointlessdistraction.registries.ClientRegistry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class DistractionModClient implements ClientModInitializer
{
	@Override
	@Environment(EnvType.CLIENT)
	public void onInitializeClient()
	{
		ClientRegistry.registerOnClient();
		renderFlowersCorrectly
			(
				// Add flowers here.
			);
	}
	
	private static void renderFlowersCorrectly(Block... blocks)
	{
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), blocks);
	}
}
