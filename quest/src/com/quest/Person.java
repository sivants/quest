package com.quest;

public abstract class Person {
	 
	
	public Person(String name) {
		this.name = name;
	}

	protected String name;


	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sayName(); 

}
