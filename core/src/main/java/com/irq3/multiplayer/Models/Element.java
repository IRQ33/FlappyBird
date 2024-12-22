package com.irq3.multiplayer.Models;

import com.badlogic.gdx.graphics.Texture;

public class Element {
    private double elementX =0;
    private double elementY =0;
    private Texture elementTexture;

    public Element(double elementX, double elementY, Texture elementTexture) {
        this.elementX = elementX;
        this.elementY = elementY;
        this.elementTexture = elementTexture;
    }


    public double getElementX() {
        return this.elementX;
    }

    public void setElementX(double elementX) {
       this.elementX = elementX;
    }

    public double getElementY() {
        return this.elementY;
    }

    public void setElementY(double elementY) {
        this.elementY = elementY;
    }

    public Texture getElementTexture() {
        return this.elementTexture;
    }

    public void setElementTexture(Texture elementTexture) {
        this.elementTexture = elementTexture;
    }
}
