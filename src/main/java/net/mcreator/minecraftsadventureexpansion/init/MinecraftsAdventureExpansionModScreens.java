
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftsadventureexpansion.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.minecraftsadventureexpansion.client.gui.RubyBagStorageGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftsAdventureExpansionModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MinecraftsAdventureExpansionModMenus.RUBY_BAG_STORAGE_GUI, RubyBagStorageGUIScreen::new);
		});
	}
}
