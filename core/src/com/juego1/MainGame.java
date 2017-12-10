package com.juego1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MainGame extends Game {
	/*private Stage escena;
	private Texture texturaFondo;
	private Texture texturaBtnCon;
	private final AssetManager assetManager = new AssetManager();
*/

	
	@Override
	public void create () {
		setScreen(new MainGameScreen(this));
		/*float ancho = Gdx.graphics.getWidth();
		float alto = Gdx.graphics.getHeight();
		escena = new Stage();

		cargarTexturas();

		//agregar fondo
		Image imgFondo = new Image(texturaFondo);
		float escalaX = ancho / imgFondo.getWidth();
		float escalaY = alto / imgFondo.getHeight();
		imgFondo.setScale(escalaX, escalaY);
		escena.addActor(imgFondo);

		// agregar botones
		TextureRegionDrawable txBtnCon = new TextureRegionDrawable(new TextureRegion(texturaBtnCon));

		ImageButton btnCon = new ImageButton(txBtnCon);
		btnCon.setPosition(ancho / 2 - btnCon.getWidth() / 2, 0.05f * alto);
		//btnCon.setPosition(ancho / 2 - btnCon.getWidth() / 2, 0.05f * alto );

		escena.addActor(btnCon);


		btnCon.addListener(new ClickListener() {
			@Override
			public  void clicked(InputEvent event, float x, float y) {

			}
		});
		*/
	}

	/*private void cargarTexturas() {
		assetManager.load("inicio.png", Texture.class);
		assetManager.load("continuar.png", Texture.class);
		assetManager.finishLoading();
		texturaFondo = assetManager.get("inicio.png");
		texturaBtnCon = assetManager.get("continuar.png");
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		escena.draw();
	}
	
	@Override
	public void dispose () {
		texturaFondo.dispose();
		texturaBtnCon.dispose();
	}
	*/
}
