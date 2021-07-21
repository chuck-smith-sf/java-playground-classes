package com.chucksmith;

public class Marker {

    public Marker() {
        this(false);
    }

    public Marker(boolean isCapped){
        this(isCapped, 0.0f);
    }

    // considered primary constructor per design pattern
    public Marker(boolean isCapped, float inLevel) {
        this.isCapped = isCapped;
        this.inLevel = inLevel;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "isCapped=" + isCapped +
                ", inLevel=" + inLevel +
                '}';
    }

    private boolean isCapped = true;

    private float inLevel = 1.0f;

    void cap() {
        isCapped = true;
    }

    void unCap() {
        isCapped = false;
    }

    void write (String letters) {
        inLevel -= letters.length() * 0.05f;
    }
}
