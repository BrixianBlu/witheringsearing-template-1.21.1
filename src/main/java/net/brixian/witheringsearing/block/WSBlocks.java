package net.brixian.witheringsearing.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.brixian.witheringsearing.WitheringSearing;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.Blocks.CRIMSON_WALL_HANGING_SIGN;

public class WSBlocks {
    protected static final Identifier SIGN_TEXTURE_ID = Identifier.of(WitheringSearing.MOD_ID, "entity/signs/withering");
    protected static final Identifier HANGING_SIGN_TEXTURE_ID = Identifier.of(WitheringSearing.MOD_ID, "entity/signs/hanging/withering");
    protected static final Identifier HANGING_SIGN_GUI_TEXTURE_ID = Identifier.of(WitheringSearing.MOD_ID, "textures/gui/hanging_signs/withering");
    private static final Identifier CUSTOM_SIGN_ID = Identifier.of(WitheringSearing.MOD_ID, "withered_sign");
    private static final Identifier CUSTOM_WALL_SIGN_ID = Identifier.of(WitheringSearing.MOD_ID, "withered_wall_sign");
    private static final Identifier CUSTOM_HANGING_SIGN_ID = Identifier.of(WitheringSearing.MOD_ID, "withered_hanging_sign");
    private static final Identifier CUSTOM_WALL_HANGING_SIGN_ID = Identifier.of(WitheringSearing.MOD_ID, "withered_wall_hanging_sign");

    public static final Block WITHERED_STEM = registerBlock("withered_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block STRIPPED_WITHERED_STEM = registerBlock("stripped_withered_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final Block WITHERED_HYPHAE = registerBlock("withered_hyphae",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block WITHERED_WART_BLOCK = registerBlock("withered_wart_block",
            new NetherWartBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block STRIPPED_WITHERED_HYPHAE = registerBlock("stripped_withered_hyphae",
            new Block(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block WITHERED_PLANKS = registerBlock("withered_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WITHERED_STAIRS = registerBlock("withered_stairs",
            new StairsBlock(WSBlocks.WITHERED_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_STAIRS)));
    public static final Block WITHERED_SLAB = registerBlock("withered_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)));
    public static final Block WITHERED_BUTTON = registerBlock("withered_button",
            new ButtonBlock(BlockSetType.CRIMSON, 2, AbstractBlock.Settings.copy(CRIMSON_BUTTON)));
    public static final Block WITHERED_PRESSURE_PLATE = registerBlock("withered_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.copy(CRIMSON_PRESSURE_PLATE)));
    public static final Block WITHERED_FENCE = registerBlock("withered_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CRIMSON_FENCE)));
    public static final Block WITHERED_FENCE_GATE = registerBlock("withered_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, AbstractBlock.Settings.copy(CRIMSON_FENCE_GATE)));
    public static final TerraformSignBlock WITHERED_SIGN = (TerraformSignBlock) registerBlockWithoutBlockItem("withered_sign",
            new TerraformSignBlock(SIGN_TEXTURE_ID, AbstractBlock.Settings.copy(CRIMSON_SIGN)));
    public static final TerraformWallSignBlock WITHERED_WALL_SIGN = (TerraformWallSignBlock) registerBlockWithoutBlockItem("withered_wall_sign",
            new TerraformWallSignBlock(CUSTOM_WALL_SIGN_ID, AbstractBlock.Settings.copy(CRIMSON_WALL_SIGN).dropsLike(WITHERED_SIGN)));
    public static final TerraformHangingSignBlock WITHERED_HANGING_SIGN = (TerraformHangingSignBlock) registerBlockWithoutBlockItem("withering_hanging_sign",
            new TerraformHangingSignBlock(HANGING_SIGN_TEXTURE_ID, HANGING_SIGN_GUI_TEXTURE_ID, AbstractBlock.Settings.copy(CRIMSON_HANGING_SIGN)));
    public static final TerraformWallHangingSignBlock WITHERED_WALL_HANGING_SIGN = (TerraformWallHangingSignBlock) registerBlockWithoutBlockItem("withered_wall_hanging_sign",
            new TerraformWallHangingSignBlock(CUSTOM_WALL_HANGING_SIGN_ID, HANGING_SIGN_GUI_TEXTURE_ID, AbstractBlock.Settings.copy(CRIMSON_WALL_HANGING_SIGN).dropsLike(WITHERED_HANGING_SIGN)));
    public static final Block CYAN_NETHER_BRICKS = registerBlock("cyan_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block CYAN_NETHER_BRICKS_SLAB = registerBlock("cyan_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(RED_NETHER_BRICKS)));
    public static final Block CYAN_NETHER_BRICKS_STAIRS = registerBlock("cyan_nether_bricks_stairs",
            new StairsBlock(WSBlocks.CYAN_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(NETHER_BRICK_STAIRS)));
    public static final Block CYAN_NETHER_BRICKS_WALL = registerBlock("cyan_nether_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_BRICK_STAIRS)));
    public static final Block INDIGO_NETHER_BRICKS = registerBlock("indigo_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block INDIGO_NETHER_BRICKS_SLAB = registerBlock("indigo_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(RED_NETHER_BRICKS)));
    public static final Block INDIGO_NETHER_BRICKS_STAIRS = registerBlock("indigo_nether_bricks_stairs",
            new StairsBlock(WSBlocks.INDIGO_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(NETHER_BRICK_STAIRS)));
    public static final Block INDIGO_NETHER_BRICKS_WALL = registerBlock("indigo_nether_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHER_BRICK_STAIRS)));
    public static final Block WITHERED_NYLIUM = registerBlock("withered_nylium",
            new WitheredNyliumBlock(AbstractBlock.Settings.copy(CRIMSON_NYLIUM)));
    public static final Block WITHERED_ROOTS = registerBlock("withered_roots",
            new RootsBlock(AbstractBlock.Settings.copy(WARPED_ROOTS)));



    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(WitheringSearing.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WitheringSearing.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(WitheringSearing.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        WitheringSearing.LOGGER.info("Registering Mod Blocks for " + WitheringSearing.MOD_ID);

    }}
