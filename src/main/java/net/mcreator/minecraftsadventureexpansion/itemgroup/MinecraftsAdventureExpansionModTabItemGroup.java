
package net.mcreator.minecraftsadventureexpansion.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.minecraftsadventureexpansion.item.RubyItem;
import net.mcreator.minecraftsadventureexpansion.MinecraftsAdventureExpansionModElements;

@MinecraftsAdventureExpansionModElements.ModElement.Tag
public class MinecraftsAdventureExpansionModTabItemGroup extends MinecraftsAdventureExpansionModElements.ModElement {
	public MinecraftsAdventureExpansionModTabItemGroup(MinecraftsAdventureExpansionModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabminecrafts_adventure_expansion_mod_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
