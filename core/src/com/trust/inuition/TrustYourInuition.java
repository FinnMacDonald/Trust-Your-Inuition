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
	private int bad_x = 400;
	private int bad_y = 120;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		snowTile[0] = new Texture("Snow1.png");
		snowTile[1] = new Texture("Snow2.png");
		snowTile[2] = new Texture("Snow3.png");
		snowTile[3] = new Texture("Snow4.png");
		badLogic = new Texture("badlogic.jpg");
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
		
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			bad_x -= 200 * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			bad_x += 200 * Gdx.graphics.getDeltaTime();
		}
		
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			bad_y += 200 * Gdx.graphics.getDeltaTime();
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)) {
			bad_y -= 200 * Gdx.graphics.getDeltaTime();
		}
		//batch.draw(img, 0, 0);
		batch.draw(badLogic, bad_x, bad_y);
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
