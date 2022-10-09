
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.djmod.entity.GolemEntity;
import net.mcreator.djmod.entity.ArcoOPEntity;
import net.mcreator.djmod.entity.AnimalevolanteEntity;
import net.mcreator.djmod.DjModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DjModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DjModMod.MODID);
	public static final RegistryObject<EntityType<GolemEntity>> GOLEM = register("golem",
			EntityType.Builder.<GolemEntity>of(GolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GolemEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnimalevolanteEntity>> ANIMALEVOLANTE = register("animalevolante",
			EntityType.Builder.<AnimalevolanteEntity>of(AnimalevolanteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnimalevolanteEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ArcoOPEntity>> ARCO_OP = register("projectile_arco_op",
			EntityType.Builder.<ArcoOPEntity>of(ArcoOPEntity::new, MobCategory.MISC).setCustomClientFactory(ArcoOPEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GolemEntity.init();
			AnimalevolanteEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOLEM.get(), GolemEntity.createAttributes().build());
		event.put(ANIMALEVOLANTE.get(), AnimalevolanteEntity.createAttributes().build());
	}
}
