
package net.mcreator.djmod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.djmod.init.DjModModTabs;

public class FrecciaOPItem extends Item {
	public FrecciaOPItem() {
		super(new Item.Properties().tab(DjModModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
