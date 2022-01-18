
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class UranioitenItem extends Item {

	public UranioitenItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("uranioiten");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
