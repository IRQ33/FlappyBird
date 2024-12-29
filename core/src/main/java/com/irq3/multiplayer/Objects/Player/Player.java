package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.irq3.multiplayer.Models.Element;

public class Player extends Element {

    public Movement movement;


    public Player(double elementX, double elementY, Texture elementTexture, double sizeX, double sizeY) {
        super(elementX, elementY, elementTexture, sizeX, sizeY);
        this.movement = new Movement(this);

    }
}
