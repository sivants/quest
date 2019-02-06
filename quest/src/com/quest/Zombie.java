package com.quest;

public class Zombie extends Person {

	public Zombie(String name) {
		super(name);
	}

	private String deathDate;

	public String getDeathDate() {
		return deathDate;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + name + " and I'm a zombie");
		
	}

	
	
}
