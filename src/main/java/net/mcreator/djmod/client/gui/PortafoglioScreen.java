
package net.mcreator.djmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.djmod.world.inventory.PortafoglioMenu;
import net.mcreator.djmod.network.PortafoglioButtonMessage;
import net.mcreator.djmod.DjModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PortafoglioScreen extends AbstractContainerScreen<PortafoglioMenu> {
	private final static HashMap<String, Object> guistate = PortafoglioMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_x1_10_trero;
	Button button_x1_trero;

	public PortafoglioScreen(PortafoglioMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 196;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("dj_mod:textures/screens/portafoglio_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_x1_10_trero = new Button(this.leftPos + 88, this.topPos + 67, 72, 20, new TranslatableComponent("gui.dj_mod.portafoglio_gui.button_x1_10_trero"), e -> {
			if (true) {
				DjModMod.PACKET_HANDLER.sendToServer(new PortafoglioButtonMessage(0, x, y, z));
				PortafoglioButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_x1_10_trero", button_x1_10_trero);
		this.addRenderableWidget(button_x1_10_trero);
		button_x1_trero = new Button(this.leftPos + 7, this.topPos + 67, 61, 20, new TranslatableComponent("gui.dj_mod.portafoglio_gui.button_x1_trero"), e -> {
			if (true) {
				DjModMod.PACKET_HANDLER.sendToServer(new PortafoglioButtonMessage(1, x, y, z));
				PortafoglioButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_x1_trero", button_x1_trero);
		this.addRenderableWidget(button_x1_trero);
	}
}
