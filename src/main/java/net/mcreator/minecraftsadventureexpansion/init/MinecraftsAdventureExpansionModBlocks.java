
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftsadventureexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftsadventureexpansion.block.UranioblockBlock;
import net.mcreator.minecraftsadventureexpansion.block.RubyOreBlock;
import net.mcreator.minecraftsadventureexpansion.block.DepslateRubyOreBlock;
import net.mcreator.minecraftsadventureexpansion.MinecraftsAdventureExpansionMod;

public class MinecraftsAdventureExpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftsAdventureExpansionMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = REGISTRY.register("deepslate_ruby_ore", () -> new DepslateRubyOreBlock());
	public static final RegistryObject<Block> URANIOBLOCK = REGISTRY.register("uranioblock", () -> new UranioblockBlock());
}
