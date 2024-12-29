package com.irq3.multiplayer.Objects.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.irq3.multiplayer.Models.Element;
import com.irq3.multiplayer.Screens.MainScreen;

public class Die {
    Player player;

    public Die(Player player) {
        this.player = player;

    }

    public void DieUpdate()
    {
        for (Element element: MainScreen.hierarchyManager.getElementList())
        {
            if(element instanceof Player) return;
            System.out.println("test");

            if(player.getRectangle().overlaps(element.getRectangle()))
            {
                Gdx.app.exit();
            }
        }
    }
}
