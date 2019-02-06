package com.quest;

public abstract class Animal {
	
	private final String name;
	private int age;
	
		
	public Animal(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	

	public abstract void makeSound(String name); 

  
	

}
