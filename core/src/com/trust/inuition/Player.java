package com.trust.inuition;

import com.badlogic.gdx.Gdx;

public class Player {
	private int health;
	private int attackVal;
	private int temperatureVal;
	private String currentWeapon;
	private int bad_x;
	private int bad_y;
	
	public Player(int health, int attackVal, int temperatureVal, String currentWeapon, int xMove, int yMove) {
		this.health = health;
		this.attackVal = attackVal;
		this.temperatureVal = temperatureVal;
		this.currentWeapon = currentWeapon;
		this.bad_x = xMove;
		this.bad_y = yMove;
	}
	
	public int getHealth() {
		return health;
	}
	public int getAttackVal() {
		return attackVal;
	}
	public int getTemperatureVal() {
		return temperatureVal;
	}
	public String getWeapon() {
		return currentWeapon;
	}
	public int getXMove() {
		return bad_x;
	}
	public int getYMove() {
		return bad_y;
	}


	public boolean moveLeft() {
		bad_x -= 200 * Gdx.graphics.getDeltaTime();
		return true;
	}
	public boolean moveRight() {
		bad_x += 200 * Gdx.graphics.getDeltaTime();
		return true;
	}
	public boolean moveUp() {
		bad_y += 200 * Gdx.graphics.getDeltaTime();
		return true;
	}
	public boolean moveDown() {
		bad_y -= 200 * Gdx.graphics.getDeltaTime();
		return true;
	}
}
