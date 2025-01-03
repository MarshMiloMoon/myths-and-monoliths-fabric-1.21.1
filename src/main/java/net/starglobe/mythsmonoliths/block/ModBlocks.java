package net.starglobe.mythsmonoliths.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starglobe.mythsmonoliths.MythsAndMonoliths;

public class ModBlocks
{
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CHISELED_CALCITE = registerBlock("chiseled_calcite",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CALCITE)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block POLISHED_SMOOTH_BASALT = registerBlock("polished_smooth_basalt",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block POLISHED_SMOOTH_BASALT_SLAB = registerBlock("polished_smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block POLISHED_SMOOTH_BASALT_STAIRS = registerBlock("polished_smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block POLISHED_SMOOTH_BASALT_WALL = registerBlock("polished_smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block CHISELED_BASALT = registerBlock("chiseled_basalt",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));

    public static final Block SMOOTH_NETHER_BRICKS = registerBlock("smooth_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block SMOOTH_NETHER_BRICK_SLAB = registerBlock("smooth_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block SMOOTH_NETHER_BRICK_STAIRS = registerBlock("smooth_nether_brick_stairs",
            new StairsBlock(Blocks.NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block SMOOTH_NETHER_BRICK_WALL = registerBlock("smooth_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block SMOOTH_RED_NETHER_BRICKS = registerBlock("smooth_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block SMOOTH_RED_NETHER_BRICK_SLAB = registerBlock("smooth_red_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block SMOOTH_RED_NETHER_BRICK_STAIRS = registerBlock("smooth_red_nether_brick_stairs",
            new StairsBlock(Blocks.RED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block SMOOTH_RED_NETHER_BRICK_WALL = registerBlock("smooth_red_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE)));

    public static final Block BEATEN_COPPER = registerBlock("beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block BEATEN_COPPER_SLAB = registerBlock("beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block SMOOTH_BEATEN_COPPER = registerBlock("smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_BEATEN_COPPER = registerBlock("waxed_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_BEATEN_COPPER_SLAB = registerBlock("waxed_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_SMOOTH_BEATEN_COPPER = registerBlock("waxed_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block EXPOSED_BEATEN_COPPER = registerBlock("exposed_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block EXPOSED_BEATEN_COPPER_SLAB = registerBlock("exposed_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block EXPOSED_SMOOTH_BEATEN_COPPER = registerBlock("exposed_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_BEATEN_COPPER = registerBlock("waxed_exposed_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_BEATEN_COPPER_SLAB = registerBlock("waxed_exposed_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_EXPOSED_SMOOTH_BEATEN_COPPER = registerBlock("waxed_exposed_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WEATHERED_BEATEN_COPPER = registerBlock("weathered_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WEATHERED_BEATEN_COPPER_SLAB = registerBlock("weathered_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WEATHERED_SMOOTH_BEATEN_COPPER = registerBlock("weathered_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_WEATHERED_BEATEN_COPPER = registerBlock("waxed_weathered_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_WEATHERED_BEATEN_COPPER_SLAB = registerBlock("waxed_weathered_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_WEATHERED_SMOOTH_BEATEN_COPPER = registerBlock("waxed_weathered_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block OXIDIZED_BEATEN_COPPER = registerBlock("oxidized_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block OXIDIZED_BEATEN_COPPER_SLAB = registerBlock("oxidized_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block OXIDIZED_SMOOTH_BEATEN_COPPER = registerBlock("oxidized_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_OXIDIZED_BEATEN_COPPER = registerBlock("waxed_oxidized_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_OXIDIZED_BEATEN_COPPER_SLAB = registerBlock("waxed_oxidized_beaten_copper_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER = registerBlock("waxed_oxidized_smooth_beaten_copper",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));

    //the functional blocks, need to go through and see what/how to fix the custom blocks and block entities
    /* public static final Block CHOMPER = registerBlock("chomper",
            new ChomperBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block GUSTER = registerBlock("guster",
            new GusterBlock(AbstractBlock.Settings.copy(Blocks.TUFF))); */

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MythsAndMonoliths.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(MythsAndMonoliths.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()
    {
        MythsAndMonoliths.LOGGER.info("Registering Mod Blocks for " + MythsAndMonoliths.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CALCITE_SLAB);
            entries.add(CALCITE_STAIRS);
            entries.add(CALCITE_WALL);
            entries.add(POLISHED_CALCITE);
            entries.add(POLISHED_CALCITE_SLAB);
            entries.add(POLISHED_CALCITE_STAIRS);
            entries.add(POLISHED_CALCITE_WALL);
            entries.add(CALCITE_BRICKS);
            entries.add(CALCITE_BRICK_SLAB);
            entries.add(CALCITE_BRICK_STAIRS);
            entries.add(CALCITE_BRICK_WALL);
            entries.add(CHISELED_CALCITE);
            entries.add(CHISELED_CALCITE_BRICKS);
            entries.add(SMOOTH_BASALT_SLAB);
            entries.add(SMOOTH_BASALT_STAIRS);
            entries.add(SMOOTH_BASALT_WALL);
            entries.add(POLISHED_SMOOTH_BASALT);
            entries.add(POLISHED_SMOOTH_BASALT_SLAB);
            entries.add(POLISHED_SMOOTH_BASALT_STAIRS);
            entries.add(POLISHED_SMOOTH_BASALT_WALL);
            entries.add(BASALT_BRICKS);
            entries.add(BASALT_BRICK_SLAB);
            entries.add(BASALT_BRICK_STAIRS);
            entries.add(BASALT_BRICK_WALL);
            entries.add(CHISELED_BASALT);
            entries.add(SMOOTH_NETHER_BRICKS);
            entries.add(SMOOTH_NETHER_BRICK_SLAB);
            entries.add(SMOOTH_NETHER_BRICK_STAIRS);
            entries.add(SMOOTH_NETHER_BRICK_WALL);
            entries.add(SMOOTH_RED_NETHER_BRICKS);
            entries.add(SMOOTH_RED_NETHER_BRICK_SLAB);
            entries.add(SMOOTH_RED_NETHER_BRICK_STAIRS);
            entries.add(SMOOTH_RED_NETHER_BRICK_WALL);
            entries.add(CHISELED_RED_NETHER_BRICKS);
            entries.add(RED_NETHER_BRICK_FENCE);
            entries.add(BEATEN_COPPER);
            entries.add(BEATEN_COPPER_SLAB);
            entries.add(SMOOTH_BEATEN_COPPER);
            entries.add(EXPOSED_BEATEN_COPPER);
            entries.add(EXPOSED_BEATEN_COPPER_SLAB);
            entries.add(EXPOSED_SMOOTH_BEATEN_COPPER);
            entries.add(WEATHERED_BEATEN_COPPER);
            entries.add(WEATHERED_BEATEN_COPPER_SLAB);
            entries.add(WEATHERED_SMOOTH_BEATEN_COPPER);
            entries.add(OXIDIZED_BEATEN_COPPER);
            entries.add(OXIDIZED_BEATEN_COPPER_SLAB);
            entries.add(OXIDIZED_SMOOTH_BEATEN_COPPER);
            entries.add(WAXED_BEATEN_COPPER);
            entries.add(WAXED_BEATEN_COPPER_SLAB);
            entries.add(WAXED_SMOOTH_BEATEN_COPPER);
            entries.add(WAXED_EXPOSED_BEATEN_COPPER);
            entries.add(WAXED_EXPOSED_BEATEN_COPPER_SLAB);
            entries.add(WAXED_EXPOSED_SMOOTH_BEATEN_COPPER);
            entries.add(WAXED_WEATHERED_BEATEN_COPPER);
            entries.add(WAXED_WEATHERED_BEATEN_COPPER_SLAB);
            entries.add(WAXED_WEATHERED_SMOOTH_BEATEN_COPPER);
            entries.add(WAXED_OXIDIZED_BEATEN_COPPER);
            entries.add(WAXED_OXIDIZED_BEATEN_COPPER_SLAB);
            entries.add(WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER);
        });
    }
}
