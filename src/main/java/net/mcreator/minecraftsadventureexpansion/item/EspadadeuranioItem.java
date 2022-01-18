
package net.mcreator.minecraftsadventureexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class EspadadeuranioItem extends PickaxeItem {
	public EspadadeuranioItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));

		setRegistryName("espadadeuranio");
	}

}