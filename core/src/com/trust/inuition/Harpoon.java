package com.trust.inuition;
import com.badlogic.gdx.graphics.Texture;

public class Harpoon extends Weapon {

	public Harpoon() {
		super(10,1,10, 100, "Physical", new Texture[] {new Texture("badlogic.jpg")});
	}

	
	public Projectile shoot(String direction) {
		Projectile bullet = new Projectile(damage, direction, 10);
		return bullet;
	}

	@Override
	public int updateAmmo(int ammoToUodate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean reload() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Texture[] getTextures() {
		return sprites;
	}

}
