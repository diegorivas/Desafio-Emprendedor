package com.juego1;


import com.badlogic.gdx.Screen;

public abstract class BaseScreen implements Screen {
    private MainGame game;

    public BaseScreen(MainGame game) {
        this.game = game;
    }
    @Override
    public void show() {

    }
    @Override
    public void render(float delta) {

    }
    @Override
    public void resize(int width, int heigth) {

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
