package net.starglobe.mythsmonoliths.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.starglobe.mythsmonoliths.block.ModBlocks;
import net.starglobe.mythsmonoliths.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool basaltBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BASALT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothNetherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothRedNetherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);

        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_BRICKS);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_CALCITE);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_CALCITE_BRICKS);
        smoothBasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothBasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_SMOOTH_BASALT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASALT_BRICKS);
        basaltBrickPool.slab(ModBlocks.BASALT_BRICK_SLAB);
        basaltBrickPool.stairs(ModBlocks.BASALT_BRICK_STAIRS);
        basaltBrickPool.wall(ModBlocks.BASALT_BRICK_WALL);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_BASALT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_NETHER_BRICKS);
        smoothNetherPool.slab(ModBlocks.SMOOTH_NETHER_BRICK_SLAB);
        smoothNetherPool.stairs(ModBlocks.SMOOTH_NETHER_BRICK_STAIRS);
        smoothNetherPool.wall(ModBlocks.SMOOTH_NETHER_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_RED_NETHER_BRICKS);
        smoothRedNetherPool.slab(ModBlocks.SMOOTH_RED_NETHER_BRICK_SLAB);
        smoothRedNetherPool.stairs(ModBlocks.SMOOTH_RED_NETHER_BRICK_STAIRS);
        smoothRedNetherPool.wall(ModBlocks.SMOOTH_RED_NETHER_BRICK_WALL);
        blockStateModelGenerator.registerLog(ModBlocks.CHISELED_RED_NETHER_BRICKS);
        redNetherBrickPool.fence(ModBlocks.RED_NETHER_BRICK_FENCE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_SMOOTH_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_SMOOTH_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_BEATEN_COPPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_SMOOTH_BEATEN_COPPER);
        //until i can figure out, all waxed copper and copper slab blockstates and item models will be manually done without datagen
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BREEZE_DUST, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRINE_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRINE_FOAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_CHARGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BOULDER_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOULDER_GRAIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.EARTH_CHARGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.GAUNTLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCHOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPPLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUSIC_DISC_STRIKE, Models.GENERATED);
    }
}
