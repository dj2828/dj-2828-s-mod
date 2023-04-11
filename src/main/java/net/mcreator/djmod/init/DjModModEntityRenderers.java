
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.djmod.client.renderer.GolemRenderer;
import net.mcreator.djmod.client.renderer.AnimalevolanteRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DjModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DjModModEntities.ARCO_OP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DjModModEntities.GOLEM.get(), GolemRenderer::new);
		event.registerEntityRenderer(DjModModEntities.ANIMALEVOLANTE.get(), AnimalevolanteRenderer::new);
	}
}
