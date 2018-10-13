package com.trust.inuition;

public class Projectile {
	private int damage;
	private String direction;
	private int size;
	private int xPos;
	private int yPos;
	
	public Projectile(int damage,String direction, int size) {
		this.damage=damage;
		this.direction=direction;
		this.size=size;
	}
	
	public boolean move() {
		if(direction.equals("up")) {
			yPos+=10;
			return true;
		} else if (direction.equals("down")) {
			yPos-=10;
			return true;
		} else if (direction.equals("left")) {
			xPos-=10;
			return true;
		} else if (direction.equals("right")){
			xPos+=10;
			return true;
		}
		return false;
	}
	
}
