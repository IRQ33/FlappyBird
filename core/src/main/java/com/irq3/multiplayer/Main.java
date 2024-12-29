package com.irq3.multiplayer;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.irq3.multiplayer.Screens.MainScreen;

public class Main extends Game {
    public SpriteBatch batch;

    @Override
    public void create() {

        batch = new SpriteBatch();
        this.setScreen(new MainScreen(this));
    }


    @Override
    public void dispose() {
        batch.dispose();
    }
}
