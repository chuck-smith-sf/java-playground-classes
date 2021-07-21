package com.chucksmith;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    public Picture(int height, int width){
        this(false, height, width);
    }

    public Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "framed=" + framed +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public boolean isFramed() {
        return framed;
    }

    public void setFramed(boolean framed) {
        this.framed = framed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
