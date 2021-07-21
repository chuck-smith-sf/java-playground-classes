package com.chucksmith;

public class Marker {


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
