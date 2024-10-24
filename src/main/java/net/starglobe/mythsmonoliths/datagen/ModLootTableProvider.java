package net.starglobe.mythsmonoliths.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.starglobe.mythsmonoliths.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.POLISHED_CALCITE_SLAB, slabDrops(ModBlocks.POLISHED_CALCITE_SLAB));
        addDrop(ModBlocks.POLISHED_CALCITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CALCITE_WALL);
        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_BRICK_SLAB, slabDrops(ModBlocks.CALCITE_BRICK_SLAB));
        addDrop(ModBlocks.CALCITE_BRICK_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_CALCITE);
        addDrop(ModBlocks.CHISELED_CALCITE_BRICKS);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.POLISHED_SMOOTH_BASALT);
        addDrop(ModBlocks.POLISHED_SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.POLISHED_SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.POLISHED_SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.POLISHED_SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.BASALT_BRICKS);
        addDrop(ModBlocks.BASALT_BRICK_SLAB, slabDrops(ModBlocks.BASALT_BRICK_SLAB));
        addDrop(ModBlocks.BASALT_BRICK_STAIRS);
        addDrop(ModBlocks.BASALT_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_BASALT);
        addDrop(ModBlocks.SMOOTH_NETHER_BRICKS);
        addDrop(ModBlocks.SMOOTH_NETHER_BRICK_SLAB, slabDrops(ModBlocks.SMOOTH_NETHER_BRICK_SLAB));
        addDrop(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.SMOOTH_NETHER_BRICK_WALL);
        addDrop(ModBlocks.SMOOTH_RED_NETHER_BRICKS);
        addDrop(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB, slabDrops(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB));
        addDrop(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.SMOOTH_RED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(ModBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(ModBlocks.BEATEN_COPPER);
        addDrop(ModBlocks.BEATEN_COPPER_SLAB, slabDrops(ModBlocks.BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.EXPOSED_BEATEN_COPPER);
        addDrop(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.WEATHERED_BEATEN_COPPER);
        addDrop(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.OXIDIZED_BEATEN_COPPER);
        addDrop(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.WAXED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_SMOOTH_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_BEATEN_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_SMOOTH_BEATEN_COPPER);
    }
}
