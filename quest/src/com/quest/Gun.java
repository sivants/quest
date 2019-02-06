package com.quest;

public class Gun extends Weapon{
	
	
	public Gun() {
		super();
	}


	private int bullets;
	
	public void AddBullets (int x) {
		this.bullets += x; 
	}
	
	public void Shoot (int x) {
		this.bullets -= x;
	}

}
