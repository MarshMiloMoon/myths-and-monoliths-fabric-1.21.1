package net.starglobe.mythsmonoliths.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.starglobe.mythsmonoliths.MythsAndMonoliths;

public class ModSoundEvents {
    public static final SoundEvent STRIKE = registerSoundEvent("music_disc_strike");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MythsAndMonoliths.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSoundEvents() {
        MythsAndMonoliths.LOGGER.info("Registering Mod Sound Events for " + MythsAndMonoliths.MOD_ID);
    }
}
