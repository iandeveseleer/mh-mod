package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.MHConstants;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static fr.slashandroses.mhcraft.MHCraft.registerSound;

public class SoundRegistry {
    public static final Identifier GLASSCUTTING_SOUND = new Identifier(MHConstants.NAMESPACE, "glasscutting");
    public static final Identifier EN_BERLINE_MUSIC = new Identifier(MHConstants.NAMESPACE, "en_berline");
    public static final Identifier NAZARETH_MUSIC = new Identifier(MHConstants.NAMESPACE, "nazareth");
    public static final Identifier BLEUCADAVRE_MUSIC = new Identifier(MHConstants.NAMESPACE, "bleucadavre");
    public static final Identifier ADEBISI_MUSIC = new Identifier(MHConstants.NAMESPACE, "adebisi");
    public static SoundEvent GLASSCUTTING_SOUND_EVENT = new SoundEvent(GLASSCUTTING_SOUND);
    public static SoundEvent EN_BERLINE_SOUND_EVENT = new SoundEvent(EN_BERLINE_MUSIC);
    public static SoundEvent NAZARETH_SOUND_EVENT = new SoundEvent(NAZARETH_MUSIC);
    public static SoundEvent BLEUCADAVRE_SOUND_EVENT = new SoundEvent(BLEUCADAVRE_MUSIC);
    public static SoundEvent ADEBISI_SOUND_EVENT = new SoundEvent(ADEBISI_MUSIC);


    public static void init() {
        registerSound(GLASSCUTTING_SOUND, GLASSCUTTING_SOUND_EVENT);
        registerSound(EN_BERLINE_MUSIC, EN_BERLINE_SOUND_EVENT);
        registerSound(NAZARETH_MUSIC, NAZARETH_SOUND_EVENT);
        registerSound(BLEUCADAVRE_MUSIC, BLEUCADAVRE_SOUND_EVENT);
        registerSound(ADEBISI_MUSIC, ADEBISI_SOUND_EVENT);
    }
}
