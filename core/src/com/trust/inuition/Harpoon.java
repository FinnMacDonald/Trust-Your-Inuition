package com.trust.inuition;



import com.badlogic.gdx.graphics.Texture;

public class Harpoon extends Weapon {

	public Harpoon() {
		super(10,1,10, 100, "Physical", new Texture[] {new Texture("badlogic.jpg")});
	}

	
	public boolean shoot(String direction) {
		// TODO Auto-generated method stub
		return false;
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

}
