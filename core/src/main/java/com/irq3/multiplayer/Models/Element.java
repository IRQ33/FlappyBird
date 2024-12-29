package com.irq3.multiplayer.Models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Element  {
    private double elementX =0;
    private double elementY =0;
    private double sizeX;
    private double sizeY;
    private Texture elementTexture;
    Rectangle rectangle;


    public Element(double elementX, double elementY, Texture elementTexture, double sizeX, double sizeY) {
        this.elementX = elementX;
        this.elementY = elementY;
        this.elementTexture = elementTexture;
        this.sizeX = sizeX;
        this.sizeY =sizeY;
        rectangle = new Rectangle((float) this.elementX, (float) this.elementY, (float) this.getSizeX(), (float) this.getSizeY());

    }

    public Rectangle getRectangle() {
        return rectangle;
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

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }
}
