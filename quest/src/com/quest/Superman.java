package com.quest;

public class Superman extends Person {

	public Superman(String name) {
		super(name);
	}

	
	private int speed;
	
	public void increaseSpeed(int x) {
		this.speed = speed + x;
	}
	
	public void decreaseSpeed(int x) {
		this.speed = speed - x;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + name + " and I'm a superman");
		
	}
}
