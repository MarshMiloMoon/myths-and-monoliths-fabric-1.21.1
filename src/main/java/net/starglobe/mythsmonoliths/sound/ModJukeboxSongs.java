package net.starglobe.mythsmonoliths.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.starglobe.mythsmonoliths.MythsAndMonoliths;

public interface ModJukeboxSongs extends JukeboxSongs {
    RegistryKey<JukeboxSong> STRIKE = of("strike");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MythsAndMonoliths.MOD_ID, id));
    }

    public static void registerModJukeboxSongs()
    {
        MythsAndMonoliths.LOGGER.info("Registering Mod Jukebox Songs for " + MythsAndMonoliths.MOD_ID);
    }
}