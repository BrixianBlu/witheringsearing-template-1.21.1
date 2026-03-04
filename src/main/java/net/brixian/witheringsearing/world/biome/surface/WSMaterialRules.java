package net.brixian.witheringsearing.world.biome.surface;

import net.brixian.witheringsearing.block.WSBlocks;
import net.brixian.witheringsearing.world.biome.WSBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

import static net.minecraft.block.Blocks.LAVA;

public class WSMaterialRules {
    private static final MaterialRules.MaterialRule NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final MaterialRules.MaterialRule WITHERED_NYLIUM = makeStateRule(WSBlocks.WITHERED_NYLIUM);
    private static final MaterialRules.MaterialRule BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final MaterialRules.MaterialCondition belowTop5 = MaterialRules.aboveY(YOffset.belowTop(5), 0);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition above31 = MaterialRules.aboveY(YOffset.fixed(31), 0);
        MaterialRules.MaterialCondition above32 = MaterialRules.aboveY(YOffset.fixed(32), 0);
        MaterialRules.MaterialCondition start30 = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(30), 0);
        MaterialRules.MaterialCondition end35 = MaterialRules.not(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(35), 0));
        MaterialRules.MaterialCondition belowTop5 = MaterialRules.aboveY(YOffset.belowTop(5), 0);
        MaterialRules.MaterialCondition hole = MaterialRules.hole();
        MaterialRules.MaterialCondition soulSandNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.SOUL_SAND_LAYER,-0.012);
        MaterialRules.MaterialCondition gravelNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL_LAYER, -0.012);
        MaterialRules.MaterialCondition patchNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.012);
        MaterialRules.MaterialCondition netherrackNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHERRACK, 0.54);
        MaterialRules.MaterialCondition netherWartNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_WART,1.17);
        MaterialRules.MaterialCondition netherStateSelectorNoise = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_STATE_SELECTOR, 0.0F);
        MaterialRules.MaterialRule lavaFill = MaterialRules.condition(
                MaterialRules.not(above32),
                MaterialRules.condition(hole, NETHERRACK)
        );

        MaterialRules.MaterialRule witheredNyliumSurface = MaterialRules.condition(MaterialRules.biome(WSBiomes.WITHERED_FOREST),
                MaterialRules.condition(above31, WITHERED_NYLIUM));

        MaterialRules.MaterialRule floorRules = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR,
                MaterialRules.sequence(
                        lavaFill,
                        witheredNyliumSurface
                )
        );

        MaterialRules.MaterialRule ceilingFill = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH,
                MaterialRules.condition(netherStateSelectorNoise, NETHERRACK)
        );

        MaterialRules.MaterialRule floorFill = MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH,
                NETHERRACK
        );

        MaterialRules.MaterialRule bedrockFloor = MaterialRules.condition(
                MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)),
                BEDROCK
        );

        MaterialRules.MaterialRule bedrockRoof = MaterialRules.condition(
                MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())),
                BEDROCK
        );

        return MaterialRules.sequence(
                bedrockFloor,
                bedrockRoof,
                MaterialRules.condition(belowTop5, NETHERRACK),
                floorRules,
                ceilingFill,
                floorFill
        );
    }


    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}