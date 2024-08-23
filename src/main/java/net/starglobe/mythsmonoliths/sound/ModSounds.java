package net.starglobe.mythsmonoliths.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.starglobe.mythsmonoliths.MythsAndMonoliths;

public class ModSounds
{
    public static RegistryKey<JukeboxSong> STRIKE = RegistryKey.of(RegistryKeys.JUKEBOX_SONG,
            Identifier.of(MythsAndMonoliths.MOD_ID, "strike"));

    /*public static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = Identifier.of(MythsAndMonoliths.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }*/

    public static void registerSounds()
    {
        MythsAndMonoliths.LOGGER.info("Registering Mod Sounds for " + MythsAndMonoliths.MOD_ID);
    }
}
