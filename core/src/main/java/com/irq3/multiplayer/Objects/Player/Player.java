package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.irq3.multiplayer.Models.Element;

public class Player extends Element {

    public Player(double playerX, double playerY, Texture playerTexture) {
        super(playerX, playerY, playerTexture);
    }

    public void movingPlayer()
    {
        this.setElementY(this.getElementY()-1);
        System.out.println("X: " +this.getElementX() + "  Y:"+this.getElementY());
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE) &&Gdx.input.isKeyPressed(Input.Keys.LEFT) ){
            for (int i=0; i<=100;i++)
            {
                setElementY(getElementY()+0.5);
            }
        }
    }

}
