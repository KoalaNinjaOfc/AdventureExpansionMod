
package net.mcreator.minecraftsadventureexpansion.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.minecraftsadventureexpansion.init.MinecraftsAdventureExpansionModBlocks;

import java.util.Set;
import java.util.Random;

public class DepslateRubyOreFeature extends OreFeature {
	public static final DepslateRubyOreFeature FEATURE = (DepslateRubyOreFeature) new DepslateRubyOreFeature()
			.setRegistryName("minecrafts_adventure_expansion:deepslate_ruby_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(DepslateRubyOreFeatureRuleTest.INSTANCE,
					MinecraftsAdventureExpansionModBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState(), 4))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(12)))).squared().count(1);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public DepslateRubyOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class DepslateRubyOreFeatureRuleTest extends RuleTest {
		static final DepslateRubyOreFeatureRuleTest INSTANCE = new DepslateRubyOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<DepslateRubyOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<DepslateRubyOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("minecrafts_adventure_expansion:deepslate_ruby_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.DEEPSLATE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
