package com.classesobjects;

 class Vegetable  {
	    String name;
	}

	class Bread {
	    String company;
	}

	class Cheese {
	    String type;
	}

	public class Sandwich {

	    public static void main(String[] args) {
	        
	    	 Vegetable veg1 = new Vegetable();
	         veg1.name = "Potato";

	         Vegetable veg2 = new Vegetable();
	         veg2.name = "Tomato";

	         Vegetable veg3 = new Vegetable();
	         veg3.name = "Onion";

	         Vegetable veg4 = new Vegetable();
	         veg4.name = "Cucumber";

	       
	        Bread bread1 = new Bread();
	        bread1.company = " Wheat Co.";

	        Bread bread2 = new Bread();
	        bread2.company = "Brown Bread Co.";

	        
	        Cheese cheese = new Cheese();
	        cheese.type = "Amul";

	       
	        System.out.println("Vegetables:");
	        System.out.println(veg1.name);
	        System.out.println(veg2.name);
	        System.out.println(veg3.name);
	        System.out.println(veg4.name);

	        
	        System.out.println("\nBreads:");
	        System.out.println(bread1.company);
	        System.out.println(bread2.company);

	       
	        System.out.println("\nCheese:");
	        System.out.println(cheese.type);
	    }
	}

