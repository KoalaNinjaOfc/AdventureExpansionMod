
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StickdeironItem extends Item {

	public StickdeironItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("stickdeiron");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
