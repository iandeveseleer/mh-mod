package fr.slashandroses.mhcraft.common.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum SemiSlabType implements StringIdentifiable {
    TOP1("top_1"),
    TOP2("top_2"),
    BOTTOM1("bottom_1"),
    BOTTOM2("bottom_2"),
    DOUBLE("double");

    private final String name;

    private SemiSlabType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
