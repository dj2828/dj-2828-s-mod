
package net.mcreator.djmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.djmod.init.DjModModTabs;

public class TreroItem extends Item {
	public TreroItem() {
		super(new Item.Properties().tab(DjModModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
