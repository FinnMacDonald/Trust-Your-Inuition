package com.trust.inuition;

import com.badlogic.gdx.graphics.Texture;

public abstract class Weapon {
	protected int damage;
	protected int ammo;
	protected int range;
	protected int magSize;
	protected String type;
	protected Texture[] sprites;
	
	public Weapon(int damage,int magSize, int ammo, int range, String type, Texture[] sprites) {
		this.damage=damage;
		this.ammo=ammo;
		this.range=range;
		this.magSize=magSize;
		this.type=type;
		this.sprites=sprites;
	}
	
	public abstract Projectile shoot(String direction);
	
	public abstract int updateAmmo(int ammoToUodate);
	
	public abstract boolean reload();
	
	public abstract Texture[] getTextures();
	
	
	
}
