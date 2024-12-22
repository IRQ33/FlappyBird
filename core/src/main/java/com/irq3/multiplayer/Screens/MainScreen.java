package com.irq3.multiplayer.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.irq3.multiplayer.Main;
import com.irq3.multiplayer.Managers.HierarchyManager;
import com.irq3.multiplayer.Models.Element;
import com.irq3.multiplayer.Objects.Player;
import com.irq3.multiplayer.Objects.TestObject;

public class MainScreen implements Screen {

    HierarchyManager hierarchyManager;
    SpriteBatch batch;
    Camera camera;
    Player player;
    TestObject testObject;

    public MainScreen(Main main)
    {
        camera=  new OrthographicCamera(256,240);
        batch = main.batch;


        hierarchyManager = new HierarchyManager();
        player=  new Player(-120,0,new Texture(Gdx.files.internal("birb.png")));
        hierarchyManager.addElement(player);

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float v) {
        /* Screen               */
        ScreenUtils.clear(0, 128, 128,1);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        for (Element element: hierarchyManager.getElementList())
        {
            batch.draw(element.getElementTexture(),(float) element.getElementX(),(float) element.getElementY());
        }
        batch.end();

        /* Rest things*/
        player.movingPlayer();

    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
