package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.irq3.multiplayer.Models.Element;
import com.irq3.multiplayer.Screens.MainScreen;

public class Die {
    Player player;

    public Die(Player player) {
        this.player = player;

    }

    public void DieState()
    {
        for (Element element: MainScreen.hierarchyManager.getElementList())
        {
            if(element instanceof Player) return;
            if(player.overlaps(element))
            {
                Gdx.app.exit();
            }
        }
    }
}
