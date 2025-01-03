package com.irq3.multiplayer.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.github.tommyettinger.textra.TextraLabel;
import com.irq3.multiplayer.FastConfig;
import com.irq3.multiplayer.Main;
import com.irq3.multiplayer.Managers.HierarchyManager;
import com.irq3.multiplayer.Managers.PipeManager;
import com.irq3.multiplayer.Models.Element;
import com.irq3.multiplayer.Objects.Pipe.Pipe;
import com.irq3.multiplayer.Objects.Player.Die;
import com.irq3.multiplayer.Objects.Player.Player;

import java.util.Random;

public class MainScreen implements Screen {

    public static HierarchyManager hierarchyManager;
    PipeManager pipeManager;
    SpriteBatch batch;
    final Camera camera;
    Player player;
    int timer= 0;
    Texture pipeBottom;
    Texture pipeUp;
    Random random;
    Die die;
    BitmapFont font;
    int score;


    public MainScreen(Main main)
    {
        // Game initializers
        camera=  new OrthographicCamera(256,240);
        batch = main.batch;
        hierarchyManager = new HierarchyManager();
        pipeManager = new PipeManager();
        random = new Random();


        //Game Element things
        pipeBottom = new Texture(Gdx.files.internal("bottompipe.png"));
        pipeUp = new Texture(Gdx.files.internal("toppipe.png"));
        player=  new Player(-120,0,new Texture(Gdx.files.internal("birb.png")), 32,32);
        hierarchyManager.addElement(player);
        Gdx.input.setInputProcessor(player.movement);
        die = new Die(player);

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 15;
        parameter.magFilter = Texture.TextureFilter.Nearest;
        parameter.minFilter = Texture.TextureFilter.Nearest;
         font = generator.generateFont(parameter);
        generator.dispose();

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float v) {

        /* Screen               */
        ScreenUtils.clear(0, 128, 128, 1);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        for (Element element : hierarchyManager.getElementList()) {
            batch.draw(element.getElementTexture(), (float) element.getElementX(), (float) element.getElementY(), (float) element.getSizeX(), (float) element.getSizeY());
        }

        font.draw(batch,"score: "+ score,40,110);
        batch.end();
        /* Rest things*/
        pipeManager.PipeMoveAndDelete();
        player.movement.movePlayer();
        timer++;

        spawnPipes();
        die.DieUpdate();


    }

    private void spawnPipes() {

        if (!(timer == FastConfig.pipeRespawnTime))  return;
            score++;
            int pipeRnd = random.nextInt(2);

            int heightBottom = random.nextInt(70) - 200;
            int heighTop = random.nextInt(60) + 30;

            if (pipeRnd == 0) {
                pipeManager.Create(new Pipe(220, heightBottom, pipeBottom, 70 , 160));
                timer = 0;
                return;
            }
                pipeManager.Create(new Pipe(220, heighTop, pipeUp, 70, 160));
                timer = 0;

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
        font.dispose();
        batch.dispose();

    }
}
