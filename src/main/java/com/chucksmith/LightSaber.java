package com.chucksmith;

public class LightSaber {
    private float charge = 100.0f;
    String color = "green";

    void setColor(String newColor) {
        color = newColor;
    }

    public void use(float minutes) {
        charge -= minutes / 60.0f / 100f;
    }

    public void charge() {
        charge = 100.0f;
    }
}
