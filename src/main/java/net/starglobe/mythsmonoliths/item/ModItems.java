package net.starglobe.mythsmonoliths.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.starglobe.mythsmonoliths.MythsAndMonoliths;
import net.starglobe.mythsmonoliths.sound.ModJukeboxSongs;

public class ModItems
{
    public static Item BREEZE_DUST = registerItem("breeze_dust", new Item(new Item.Settings()));

    public static Item BRINE_ROD = registerItem("brine_rod", new Item(new Item.Settings()));
    public static Item BRINE_FOAM = registerItem("brine_foam", new Item(new Item.Settings()));
    public static Item WATER_CHARGE = registerItem("water_charge", new Item(new Item.Settings()));

    public static Item BOULDER_ROD = registerItem("boulder_rod", new Item(new Item.Settings()));
    public static Item BOULDER_GRAIN = registerItem("boulder_grain", new Item(new Item.Settings()));
    public static Item EARTH_CHARGE = registerItem("earth_charge", new Item(new Item.Settings()));

    public static Item GAUNTLET = registerItem("gauntlet", new Item(new Item.Settings()));
    public static Item ANCHOR = registerItem("anchor", new Item(new Item.Settings()));
    public static Item GRAPPLE = registerItem("grapple", new Item(new Item.Settings()));

    public static Item MUSIC_DISC_STRIKE = registerItem("music_disc_strike",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.STRIKE)));

    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(MythsAndMonoliths.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MythsAndMonoliths.LOGGER.info("Registering Mod Items for " + MythsAndMonoliths.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Items.FIRE_CHARGE);

            entries.add(BREEZE_DUST);
            entries.add(Items.WIND_CHARGE);

            entries.add(BRINE_ROD);
            entries.add(BRINE_FOAM);
            entries.add(WATER_CHARGE);

            entries.add(BOULDER_ROD);
            entries.add(BOULDER_GRAIN);
            entries.add(EARTH_CHARGE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(WATER_CHARGE);
            entries.add(EARTH_CHARGE);
            entries.add(GRAPPLE);
            entries.add(MUSIC_DISC_STRIKE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ANCHOR);
            entries.add(GAUNTLET);
            entries.add(Items.FIRE_CHARGE);
            entries.add(WATER_CHARGE);
            entries.add(EARTH_CHARGE);
        });
    }
}
