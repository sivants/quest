package com.quest;

public class Horse extends Animal {
	
	public Horse(String name) {
		super(name);
	}

	private int speed;
	
	
	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int x){
		this.speed += x;
	}
	
	public void decreaseSpeed(int x) {
		this.speed -= x;
	}


	@Override
	public void makeSound(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " is braying");
	}
}
