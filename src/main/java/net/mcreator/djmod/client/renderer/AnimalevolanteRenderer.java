
package net.mcreator.djmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.djmod.entity.AnimalevolanteEntity;
import net.mcreator.djmod.client.model.Modelanimale_volante;

public class AnimalevolanteRenderer extends MobRenderer<AnimalevolanteEntity, Modelanimale_volante<AnimalevolanteEntity>> {
	public AnimalevolanteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanimale_volante(context.bakeLayer(Modelanimale_volante.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnimalevolanteEntity entity) {
		return new ResourceLocation("dj_mod:textures/entities/animale_volante.png");
	}
}
