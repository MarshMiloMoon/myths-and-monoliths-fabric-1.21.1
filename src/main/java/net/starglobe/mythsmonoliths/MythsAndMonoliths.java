package net.starglobe.mythsmonoliths;

import net.fabricmc.api.ModInitializer;

import net.starglobe.mythsmonoliths.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythsAndMonoliths implements ModInitializer
{
	public static final String MOD_ID = "mythsmonoliths";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModBlocks.registerModBlocks();
	}
}