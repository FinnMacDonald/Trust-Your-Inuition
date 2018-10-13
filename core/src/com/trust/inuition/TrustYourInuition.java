package com.trust.inuition;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TrustYourInuition extends ApplicationAdapter {
	SpriteBatch batch;
	Texture [] snowTile = new Texture[4];
	int[][] tileSeed = new int[50][30];
	Texture badLogic;
	//private int bad_x = 400;
	//private int bad_y = 120;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		snowTile[0] = new Texture("assets/Snow1.png");
		snowTile[1] = new Texture("assets/Snow2.png");
		snowTile[2] = new Texture("assets/Snow3.png");
		snowTile[3] = new Texture("assets/Snow4.png");
		badLogic = new Texture("assets/NigelSideLRight.png");
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 30; j++) {
			   tileSeed[i][j] = new Random().nextInt(snowTile.length);   
			}
			
		}
		
		
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 15; j++) {
			   batch.draw(snowTile[tileSeed[i][j]], 32*i, 32*j, 32, 32);	
			}
			
			// double length of each pixel in future
		}
		Player Nigel = new Player(100, 10, 100,"Harpoon",400, 120);
		
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			Nigel.moveLeft();
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			Nigel.moveRight();
		}
		
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			Nigel.moveUp();
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			Nigel.moveDown();
		}
		//batch.draw(img, 0, 0);
		batch.draw(badLogic, Nigel.getXMove(), Nigel.getYMove());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		snowTile[0].dispose();
		snowTile[1].dispose();
		snowTile[2].dispose();
		snowTile[3].dispose();
	}
}
