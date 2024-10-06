package net.starglobe.mythsmonoliths;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.starglobe.mythsmonoliths.datagen.ModBlockTagProvider;
import net.starglobe.mythsmonoliths.datagen.ModLootTableProvider;

public class MythsAndMonolithsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
