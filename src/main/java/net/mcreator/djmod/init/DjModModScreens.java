
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.djmod.client.gui.PortafoglioScreen;
import net.mcreator.djmod.client.gui.GolemguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DjModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DjModModMenus.PORTAFOGLIO_GUI, PortafoglioScreen::new);
			MenuScreens.register(DjModModMenus.GOLEMGUI, GolemguiScreen::new);
		});
	}
}
