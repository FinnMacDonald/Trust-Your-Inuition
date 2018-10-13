package com.trust.inuition;

import com.badlogic.gdx.graphics.Texture;

public abstract class Weapon {
	private int damage;
	private int ammo;
	private int range;
	private int magSize;
	private String type;
	private Texture[] sprites;
	
	public Weapon(int damage,int magSize, int ammo, int range, String type, Texture[] sprites) {
		this.damage=damage;
		this.ammo=ammo;
		this.range=range;
		this.magSize=magSize;
		this.type=type;
		this.sprites=sprites;
	}
	
	public abstract boolean shoot(String direction);
	
	public abstract int updateAmmo(int ammoToUodate);
	
	public abstract boolean reload();
	
	
}
