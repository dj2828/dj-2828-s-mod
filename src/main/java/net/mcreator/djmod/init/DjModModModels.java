
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.djmod.client.model.Modelgolem;
import net.mcreator.djmod.client.model.Modelelmo_OP;
import net.mcreator.djmod.client.model.Modelchestplate_OP;
import net.mcreator.djmod.client.model.Modelanimale_volante;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DjModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelchestplate_OP.LAYER_LOCATION, Modelchestplate_OP::createBodyLayer);
		event.registerLayerDefinition(Modelanimale_volante.LAYER_LOCATION, Modelanimale_volante::createBodyLayer);
		event.registerLayerDefinition(Modelelmo_OP.LAYER_LOCATION, Modelelmo_OP::createBodyLayer);
		event.registerLayerDefinition(Modelgolem.LAYER_LOCATION, Modelgolem::createBodyLayer);
	}
}
