package com.quest;

public class Dragon extends Animal {
	
	private int hieght;
	
	public Dragon(String name) {
		super(name);
	}

	public void setHieght(int hieght) {
		this.hieght = hieght;
	}

	public int getHieght() {
		return hieght;
	}

	
	@Override
	public void makeSound(String name) {
		System.out.println(name + " is growling");
		
	}
	
}
