package net.brixian.witheringsearing.datagen;

import net.brixian.witheringsearing.block.WSBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class WSModelGenerator extends FabricModelProvider {
    public WSModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(WSBlocks.WITHERED_STEM).log(WSBlocks.WITHERED_STEM).wood(WSBlocks.WITHERED_HYPHAE);
        blockStateModelGenerator.registerLog(WSBlocks.STRIPPED_WITHERED_STEM).log(WSBlocks.STRIPPED_WITHERED_STEM).wood(WSBlocks.STRIPPED_WITHERED_HYPHAE);
        blockStateModelGenerator.registerSimpleCubeAll(WSBlocks.WITHERED_WART_BLOCK);
        BlockStateModelGenerator.BlockTexturePool WitheredPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(WSBlocks.WITHERED_PLANKS);
        WitheredPlanksPool.stairs(WSBlocks.WITHERED_STAIRS);
        WitheredPlanksPool.button(WSBlocks.WITHERED_BUTTON);
        WitheredPlanksPool.fence(WSBlocks.WITHERED_FENCE);
        WitheredPlanksPool.fenceGate(WSBlocks.WITHERED_FENCE_GATE);
        WitheredPlanksPool.slab(WSBlocks.WITHERED_SLAB);
        blockStateModelGenerator.registerDoor(WSBlocks.WITHERED_DOOR);
        blockStateModelGenerator.registerTrapdoor(WSBlocks.WITHERED_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
