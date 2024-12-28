package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.irq3.multiplayer.FastConfig;

public class Movement implements InputProcessor {

    Player player;
    public Movement(Player player)
    {
        this.player=  player;
    }

    @Override
    public boolean keyDown(int i) {
        switch (i)
        {
            case Input.Keys.SPACE:
                player.setElementY(player.getElementY()+FastConfig.playerForceJump);
                break;
            case Input.Keys.ESCAPE:
                Gdx.app.exit();
        }

        return false;
    }

    @Override
    public boolean keyUp(int i) {

        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchCancelled(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;
    }

    @Override
    public boolean mouseMoved(int i, int i1) {
        return false;
    }

    @Override
    public boolean scrolled(float v, float v1) {
        return false;
    }

    public void movePlayer()
    {
        player.setElementY(player.getElementY()- FastConfig.playerGravitation);
        if(player.getElementY()<=-120)
        {
            System.out.println("xd");
            Gdx.app.exit();
        }
//
    }

}
