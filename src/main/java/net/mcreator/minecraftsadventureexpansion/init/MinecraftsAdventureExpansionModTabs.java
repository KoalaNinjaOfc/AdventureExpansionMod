
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftsadventureexpansion.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecraftsAdventureExpansionModTabs {
	public static CreativeModeTab TAB_MINECRAFTS_ADVENTURE_EXPANSION_MOD_TAB;

	public static void load() {
		TAB_MINECRAFTS_ADVENTURE_EXPANSION_MOD_TAB = new CreativeModeTab("tabminecrafts_adventure_expansion_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecraftsAdventureExpansionModItems.TABICON);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
