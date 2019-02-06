package com.quest;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Knight knight = new Knight("knight");
		Superman superman = new Superman("superman");
		Zombie zombie = new Zombie("zombie");
		
		knight.getWeapon();
		knight.sayName();
		knight.setName("knight");
		knight.setWeapon("knife");
		knight.UseWeapon("gun");
		
		superman.increaseSpeed(5);
		superman.sayName();
		superman.setName("sman");
	
		zombie.getDeathDate();
		zombie.sayName();
		zombie.setName("zmb");
		
		
		Knife knife = new Knife();
		Gun gun = new Gun();
		
		knife.getOwner();
		knife.getSharpness();
		knife.getSterngth();
		knife.setOwner("knt");
		
		gun.AddBullets(6);
		gun.getOwner();
		gun.getSterngth();
		gun.setOwner("sman");
		gun.Shoot(2);
		
		
		
		Horse horse = new Horse("hrs");
		Dragon dragon = new Dragon("drgn");
		
		horse.decreaseSpeed(8);
		horse.getAge();
		horse.getName();
		horse.increaseSpeed(4);
		horse.makeSound("horse");
		horse.setAge(6);
		
		dragon.getHieght();
		dragon.setHieght(25);
		dragon.getAge();
		dragon.getName();
		dragon.setAge(300);
		dragon.makeSound("dragon");

	
	
	//polymorphism
	
	Person person1 = new Superman("Superman");
	Person person2 = new Zombie("zombie");
	Person person3 = new Knight("knight");

	Weapon weapon1 = new Knife();
	Weapon weapon2 = new Gun();
		
	weapon1 = knife;
	weapon1.getOwner();
	
	weapon2 = gun;
	weapon2.getOwner();
	
	Animal animal1 = new Horse("horse");
	Animal animal2 = new Dragon("dragon");
	
	animal1.getName();
	animal1.getAge();
	
	
	animal2.getName();
	animal2.getAge();
	
	
	
	
}



}







