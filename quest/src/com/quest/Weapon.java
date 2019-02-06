package com.quest;

public class Weapon {
	
	private final int strength;
	private String Owner;
	
	public Weapon() {
		super();
		this.strength = 60;
	}


	public int getSterngth() {
		return strength;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	
	

}
