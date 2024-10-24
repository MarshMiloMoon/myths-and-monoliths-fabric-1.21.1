package net.starglobe.mythsmonoliths.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.starglobe.mythsmonoliths.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.POLISHED_CALCITE_SLAB)
                .add(ModBlocks.POLISHED_CALCITE_STAIRS)
                .add(ModBlocks.POLISHED_CALCITE_WALL)
                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.CHISELED_CALCITE)
                .add(ModBlocks.CHISELED_CALCITE_BRICKS)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.POLISHED_SMOOTH_BASALT)
                .add(ModBlocks.POLISHED_SMOOTH_BASALT_SLAB)
                .add(ModBlocks.POLISHED_SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.POLISHED_SMOOTH_BASALT_WALL)
                .add(ModBlocks.BASALT_BRICKS)
                .add(ModBlocks.BASALT_BRICK_SLAB)
                .add(ModBlocks.BASALT_BRICK_STAIRS)
                .add(ModBlocks.BASALT_BRICK_WALL)
                .add(ModBlocks.CHISELED_BASALT)
                .add(ModBlocks.SMOOTH_NETHER_BRICKS)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_SLAB)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_WALL)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICKS)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_WALL)
                .add(ModBlocks.CHISELED_RED_NETHER_BRICKS)
                .add(ModBlocks.RED_NETHER_BRICK_FENCE)
                .add(ModBlocks.BEATEN_COPPER)
                .add(ModBlocks.BEATEN_COPPER_SLAB)
                .add(ModBlocks.SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.EXPOSED_BEATEN_COPPER)
                .add(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WEATHERED_BEATEN_COPPER)
                .add(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.OXIDIZED_BEATEN_COPPER)
                .add(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BEATEN_COPPER)
                .add(ModBlocks.BEATEN_COPPER_SLAB)
                .add(ModBlocks.SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.EXPOSED_BEATEN_COPPER)
                .add(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WEATHERED_BEATEN_COPPER)
                .add(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.OXIDIZED_BEATEN_COPPER)
                .add(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_SMOOTH_BEATEN_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.BASALT_BRICK_SLAB)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_SLAB)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB)
                .add(ModBlocks.BEATEN_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)
                .add(ModBlocks.BASALT_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.BASALT_BRICK_WALL)
                .add(ModBlocks.SMOOTH_NETHER_BRICK_WALL)
                .add(ModBlocks.SMOOTH_RED_NETHER_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.RED_NETHER_BRICK_FENCE);
    }
}
