
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftsadventureexpansion.init.MinecraftsAdventureExpansionModTabs;

public class FabricItem extends Item {
	public FabricItem() {
		super(new Item.Properties().tab(MinecraftsAdventureExpansionModTabs.TAB_MINECRAFTS_ADVENTURE_EXPANSION_MOD_TAB).stacksTo(64)
				.rarity(Rarity.COMMON));
		setRegistryName("fabric");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
