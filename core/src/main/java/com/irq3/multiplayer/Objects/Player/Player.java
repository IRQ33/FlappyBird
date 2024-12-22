package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.irq3.multiplayer.Models.Element;

public class Player extends Element {

    public Movement movement;
    public Player(double playerX, double playerY, Texture playerTexture) {
        super(playerX, playerY, playerTexture);
        this.movement = new Movement(this);
    }


}
