package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.irq3.multiplayer.Managers.PipeManager;
import com.irq3.multiplayer.Objects.Pipe.Pipe;

public class Die {
    Player player;

    public Die(Player player) {
        this.player = player;

    }

    public void DieState()
    {
        for (Pipe pipe: PipeManager.pipeArrayList)
        {
            if(player.overlaps(pipe))
            {
                Gdx.app.exit();
            }
        }
    }
}
