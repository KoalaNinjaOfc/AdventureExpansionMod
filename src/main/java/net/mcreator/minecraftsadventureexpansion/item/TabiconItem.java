
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class TabiconItem extends Item {
	public TabiconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("tabicon");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}