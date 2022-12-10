
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.djmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DjModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(DjModModItems.TRERO.get()), 10000, 0, 0f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(DjModModItems.TRERO.get()),

					new ItemStack(Items.EMERALD), 10000, 0, 0f));
		}
	}
}
