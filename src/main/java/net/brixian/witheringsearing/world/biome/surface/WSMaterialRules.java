package net.brixian.witheringsearing.world.biome.surface;

import net.brixian.witheringsearing.block.WSBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class WSMaterialRules {
    private static final MaterialRules.MaterialRule NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final MaterialRules.MaterialRule WITHERED_NYLIUM = makeStateRule(WSBlocks.WITHERED_NYLIUM);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, WITHERED_NYLIUM), NETHERRACK);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, NETHERRACK)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, NETHERRACK)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }
    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}