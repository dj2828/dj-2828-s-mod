
package net.mcreator.djmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.djmod.entity.GolemEntity;
import net.mcreator.djmod.client.model.Modelgolem;

public class GolemRenderer extends MobRenderer<GolemEntity, Modelgolem<GolemEntity>> {
	public GolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolem(context.bakeLayer(Modelgolem.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemEntity entity) {
		return new ResourceLocation("dj_mod:textures/entities/golem.png");
	}
}
