package com.classesobjects;

public class Jungle {
	public static void main(String [] args) {
		        Animal lion = new Animal();
		        lion.name = "Lion";
		        lion.color = "Golden";
		        lion.type = "Wild";

		        Animal dog = new Animal();
		        dog.name = "Dog";
		        dog.color = "Brown";
		        dog.type = "Domestic";

		  
		        Bird parrot = new Bird();
		        parrot.name = "Parrot";
		        parrot.color = "Green";

		        Bird crow = new Bird();
		        crow.name = "Crow";
		        crow.color = "Black";

		        
		        System.out.println("Animal 1: " + lion.name + ", " + lion.color + ", " + lion.type);
		        System.out.println("Animal 2: " + dog.name + ", " + dog.color + ", " + dog.type);

		        
		        System.out.println("Bird 1: " + parrot.name + ", " + parrot.color);
		        System.out.println("Bird 2: " + crow.name + ", " + crow.color);
		    }
		}



