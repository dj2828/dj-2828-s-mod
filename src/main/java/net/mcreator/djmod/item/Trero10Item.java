
package net.mcreator.djmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.djmod.init.DjModModTabs;

public class Trero10Item extends Item {
	public Trero10Item() {
		super(new Item.Properties().tab(DjModModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
