package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.MHConstants;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static fr.slashandroses.mhcraft.MHCraft.registerSound;

public class SoundRegistry {
    public static final Identifier GLASSCUTTING_SOUND = new Identifier(MHConstants.NAMESPACE, "glasscutting");
    public static SoundEvent GLASSCUTTING_SOUND_EVENT = new SoundEvent(GLASSCUTTING_SOUND);

    public static void init() {
        registerSound(GLASSCUTTING_SOUND, GLASSCUTTING_SOUND_EVENT);
    }
}
