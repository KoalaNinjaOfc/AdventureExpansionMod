
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftsadventureexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraftsadventureexpansion.item.UraniumSwordItem;
import net.mcreator.minecraftsadventureexpansion.item.UranioitenItem;
import net.mcreator.minecraftsadventureexpansion.item.StickdeironItem;
import net.mcreator.minecraftsadventureexpansion.item.RubyItem;
import net.mcreator.minecraftsadventureexpansion.item.RubyBagItem;
import net.mcreator.minecraftsadventureexpansion.item.PIKARETADEURANIOItem;
import net.mcreator.minecraftsadventureexpansion.item.FabricItem;
import net.mcreator.minecraftsadventureexpansion.MinecraftsAdventureExpansionMod;

public class MinecraftsAdventureExpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftsAdventureExpansionMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(MinecraftsAdventureExpansionModBlocks.RUBY_ORE,
			MinecraftsAdventureExpansionModTabs.TAB_MINECRAFTS_ADVENTURE_EXPANSION_MOD_TAB);
	public static final RegistryObject<Item> FABRIC = REGISTRY.register("fabric", () -> new FabricItem());
	public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE = block(MinecraftsAdventureExpansionModBlocks.DEEPSLATE_RUBY_ORE,
			MinecraftsAdventureExpansionModTabs.TAB_MINECRAFTS_ADVENTURE_EXPANSION_MOD_TAB);
	public static final RegistryObject<Item> URANIOBLOCK = block(MinecraftsAdventureExpansionModBlocks.URANIOBLOCK, null);
	public static final RegistryObject<Item> URANIOITEN = REGISTRY.register("uranioiten", () -> new UranioitenItem());
	public static final RegistryObject<Item> STICKDEIRON = REGISTRY.register("stickdeiron", () -> new StickdeironItem());
	public static final RegistryObject<Item> URANIUM_SWORD = REGISTRY.register("uranium_sword", () -> new UraniumSwordItem());
	public static final RegistryObject<Item> PIKARETADEURANIO = REGISTRY.register("pikaretadeuranio", () -> new PIKARETADEURANIOItem());
	public static final RegistryObject<Item> RUBY_BAG = REGISTRY.register("ruby_bag", () -> new RubyBagItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
