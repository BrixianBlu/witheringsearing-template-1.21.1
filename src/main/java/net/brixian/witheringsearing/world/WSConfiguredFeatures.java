package net.brixian.witheringsearing.world;

import net.brixian.witheringsearing.WitheringSearing;
import net.brixian.witheringsearing.block.WSBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class WSConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOWSHROOM_GIANT = registerKey("glowshroom_giant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLOWSHROOM_PATCH = registerKey("glowshroom_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WITHERED_FUNGUS = registerKey("withered_fungus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WITHERED_FUNGUS_PLANTED = registerKey("withered_fungus_planted");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        BlockPredicate blockPredicate = BlockPredicate.matchingBlocks(new Block[]{Blocks.OAK_SAPLING, Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING, Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.CHERRY_SAPLING, Blocks.DARK_OAK_SAPLING, Blocks.MANGROVE_PROPAGULE, Blocks.DANDELION, Blocks.TORCHFLOWER, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP, Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.WITHER_ROSE, Blocks.LILY_OF_THE_VALLEY, Blocks.BROWN_MUSHROOM, Blocks.RED_MUSHROOM, Blocks.WHEAT, Blocks.SUGAR_CANE, Blocks.ATTACHED_PUMPKIN_STEM, Blocks.ATTACHED_MELON_STEM, Blocks.PUMPKIN_STEM, Blocks.MELON_STEM, Blocks.LILY_PAD, Blocks.NETHER_WART, Blocks.COCOA, Blocks.CARROTS, Blocks.POTATOES, Blocks.CHORUS_PLANT, Blocks.CHORUS_FLOWER, Blocks.TORCHFLOWER_CROP, Blocks.PITCHER_CROP, Blocks.BEETROOTS, Blocks.SWEET_BERRY_BUSH, Blocks.WARPED_FUNGUS, Blocks.CRIMSON_FUNGUS, Blocks.WEEPING_VINES, Blocks.WEEPING_VINES_PLANT, Blocks.TWISTING_VINES, Blocks.TWISTING_VINES_PLANT, Blocks.CAVE_VINES, Blocks.CAVE_VINES_PLANT, Blocks.SPORE_BLOSSOM, Blocks.AZALEA, Blocks.FLOWERING_AZALEA, Blocks.MOSS_CARPET, Blocks.PINK_PETALS, Blocks.BIG_DRIPLEAF, Blocks.BIG_DRIPLEAF_STEM, Blocks.SMALL_DRIPLEAF});
        ConfiguredFeatures.register(context, WITHERED_FUNGUS, Feature.HUGE_FUNGUS, new HugeFungusFeatureConfig(Blocks.WARPED_NYLIUM.getDefaultState(), Blocks.WARPED_STEM.getDefaultState(), Blocks.WARPED_WART_BLOCK.getDefaultState(), Blocks.SHROOMLIGHT.getDefaultState(), blockPredicate, false));
        ConfiguredFeatures.register(context, WITHERED_FUNGUS_PLANTED, Feature.HUGE_FUNGUS, new HugeFungusFeatureConfig(Blocks.WARPED_NYLIUM.getDefaultState(), Blocks.WARPED_STEM.getDefaultState(), Blocks.WARPED_WART_BLOCK.getDefaultState(), Blocks.SHROOMLIGHT.getDefaultState(), blockPredicate, true));

        register(context, GLOWSHROOM_PATCH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(WSBlocks.WITHERED_FUNGUS.getDefaultState())),
                        List.of(WSBlocks.WITHERED_NYLIUM)));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(WitheringSearing.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}