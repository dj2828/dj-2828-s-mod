
package net.mcreator.djmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.djmod.init.DjModModTabs;

import java.util.List;

public class TestamartelloOPItem extends Item {
	public TestamartelloOPItem() {
		super(new Item.Properties().tab(DjModModTabs.TAB_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("testa di un martello OP"));
	}
}
