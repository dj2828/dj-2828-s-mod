
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.djmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.djmod.network.TastoOPMessage;
import net.mcreator.djmod.DjModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DjModModKeyMappings {
	public static final KeyMapping TASTO_OP = new KeyMapping("key.dj_mod.tasto_op", GLFW.GLFW_KEY_Y, "key.categories.gameplay");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(TASTO_OP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == TASTO_OP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DjModMod.PACKET_HANDLER.sendToServer(new TastoOPMessage(0, 0));
						TastoOPMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
