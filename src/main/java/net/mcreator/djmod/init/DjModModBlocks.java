
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.djmod.block.DimensioneOPPortalBlock;
import net.mcreator.djmod.block.CraftmartelloOPBlock;
import net.mcreator.djmod.DjModMod;

public class DjModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DjModMod.MODID);
	public static final RegistryObject<Block> BLOCCO_TESTA_MARTELLO_OP = REGISTRY.register("blocco_testa_martello_op", () -> new CraftmartelloOPBlock());
	public static final RegistryObject<Block> DIMENSIONE_OP_PORTAL = REGISTRY.register("dimensione_op_portal", () -> new DimensioneOPPortalBlock());
}
