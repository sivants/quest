package com.quest;

public class Knight extends Person{
	
	
	public Knight(String name) {
		super(name);
	}

	private String Weapon;

	public String getWeapon() {
		return Weapon;
	}

	public void setWeapon(String weapon) {
		Weapon = weapon;
	}
	
	public void UseWeapon(String weapon){
		System.out.println("My weapon is a " + weapon);
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + name + " and I'm a knight");
		
	}
	
	

}
