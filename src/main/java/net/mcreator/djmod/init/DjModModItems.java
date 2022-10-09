
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.djmod.item.TreroItem;
import net.mcreator.djmod.item.Trero10Item;
import net.mcreator.djmod.item.TestamartelloOPItem;
import net.mcreator.djmod.item.SaccaportafoglioItem;
import net.mcreator.djmod.item.FrecciaOPItem;
import net.mcreator.djmod.item.DimensioneOPItem;
import net.mcreator.djmod.item.CosaOPItem;
import net.mcreator.djmod.item.ArcoOPItem;
import net.mcreator.djmod.DjModMod;

public class DjModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DjModMod.MODID);
	public static final RegistryObject<Item> TRERO = REGISTRY.register("trero", () -> new TreroItem());
	public static final RegistryObject<Item> TRERO_10 = REGISTRY.register("trero_10", () -> new Trero10Item());
	public static final RegistryObject<Item> MARTELLO_OP = REGISTRY.register("martello_op", () -> new CosaOPItem());
	public static final RegistryObject<Item> BLOCCO_TESTA_MARTELLO_OP = block(DjModModBlocks.BLOCCO_TESTA_MARTELLO_OP, DjModModTabs.TAB_TAB);
	public static final RegistryObject<Item> TESTAMARTELLO_OP = REGISTRY.register("testamartello_op", () -> new TestamartelloOPItem());
	public static final RegistryObject<Item> SACCAPORTAFOGLIO = REGISTRY.register("saccaportafoglio", () -> new SaccaportafoglioItem());
	public static final RegistryObject<Item> GOLEM = REGISTRY.register("golem_spawn_egg",
			() -> new ForgeSpawnEggItem(DjModModEntities.GOLEM, -11513776, -43776, new Item.Properties().tab(DjModModTabs.TAB_TAB)));
	public static final RegistryObject<Item> FRECCIA_OP = REGISTRY.register("freccia_op", () -> new FrecciaOPItem());
	public static final RegistryObject<Item> ANIMALEVOLANTE = REGISTRY.register("animalevolante_spawn_egg",
			() -> new ForgeSpawnEggItem(DjModModEntities.ANIMALEVOLANTE, -43776, -16776706, new Item.Properties().tab(DjModModTabs.TAB_TAB)));
	public static final RegistryObject<Item> ARCO_OP = REGISTRY.register("arco_op", () -> new ArcoOPItem());
	public static final RegistryObject<Item> DIMENSIONE_OP = REGISTRY.register("dimensione_op", () -> new DimensioneOPItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
