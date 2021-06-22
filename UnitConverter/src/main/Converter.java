package main;

import java.util.Scanner;

public class Converter {

	public static boolean isValid = false;

	public static void main(String[] args) {
		
		System.out.println("\n((||-----Welcome to to project4 !-----||))\n");

			
		while(!isValid) {
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		
			String menuSelection = " ";
			
			System.out.println("Please select an option:");
			System.out.println("1. Volume Convertor.\r\n"
					+ "2. Distance Converter\r\n"
					+ "3. Fuel Economy Converter\r\n"
					+ "q. Quit");
		
			menuSelection = input.nextLine();
			switch(menuSelection) {
			case "1":
				System.out.println("Volume Convertor");
				volumeConversions();
				break;
			case "2":
				System.out.println("Distance Convertes");
				distanceConversions();
				break;
			case "3":
				System.out.println("Fuel Economy Converter");
				fuelEconomyConverter();
				break;
			 case "q":
				System.exit(0);
				break;
			default:
				System.out.println("\nPlease select a number from 1 to 3 or press q to quit."); 
				isValid = false;	
			}
		}
	}
	
	//=================================================================================================//
	
	  private static void volumeConversions() {
		  while(!isValid) {
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				
				String menuSelection = " ";
				
				System.out.println("Please select an option:");
				System.out.println("1. Cups to Teaspoons\r\n"
						+ "2. Teaspoons to Tablespoons\r\n"
						+ "3. Cups to Ounces\r\n"
						+ "4. Go back to the main menu");
			
				menuSelection = input.nextLine();
				
				switch(menuSelection) {
				case "1":
					System.out.println("Cups to Teaspoon");
					cupsToTeaspoons();
					break;
				case "2":
					System.out.println("Tablespoons to Teaspoons");
					tablespoonsToTeaspoons();
					break;
				case "3":
					System.out.println("Cups to Ounces");
					cupToOunce();
					break;
				 case "4":
					 main(null);
					break;
				default:
					System.out.println("\nPlease type your choice number from 1 to 3 or press 4 to go back to the main menu."); 
					isValid = false;	
				}
		  }
	  }
	
	  //case1 Cups to Teaspoons
	  private static void cupsToTeaspoons() {
			System.out.println("Please enter the amount in cups:"); 
			@SuppressWarnings("resource")
			Scanner cupAmount = new Scanner(System.in);
			double cup = 0.0;
		    cup = cupAmount.nextDouble();		
			double teaSpoons = 0.0;
			teaSpoons = cup * 48;
			
			System.out.println(cup+" cups equals "+teaSpoons+" teaspoons.");
			System.out.println("===========================\n");
		}
	  //case2 Tablespoons to Teaspoons
	  private static void tablespoonsToTeaspoons() {
			System.out.println("Please enter the amount in Tablespoons:"); 
			@SuppressWarnings("resource")
			Scanner spoonAmount = new Scanner(System.in);
			double tableSpoons = spoonAmount.nextDouble();		
			double teaSpoon;
			teaSpoon = tableSpoons * 3;
			
			System.out.println(tableSpoons  +" tablespoons equals "+teaSpoon+" teaspoons.");
			System.out.println("===========================\n");
		}
	  //case3 Cup to Ounce
	  private static void cupToOunce() {
			System.out.println("Please enter the amount in Cups:"); 
			@SuppressWarnings("resource")
			Scanner cupsAmount = new Scanner(System.in);
			double cup = cupsAmount.nextDouble();		
			double oz;
			oz = cup * 8;
			
			System.out.println(cup  +" cups equals "+oz+" oz.");
			System.out.println("===========================\n");
		}
	  
//====================================================================================================//
	
	  private static void distanceConversions() {
		  while(!isValid) {
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);

				String menuSelection = " ";	
				
				System.out.println("Please select an option:");
				System.out.println("1. Miles to Kilometers\r\n"
						+ "2. Feet to Meters\r\n"
						+ "3. Inches to Centimeters\r\n"
						+ "4. Go back to the main menu");
			
				menuSelection = input.nextLine();
				
				switch(menuSelection) {
				case "1":
					System.out.println("Miles to Kilometers");
					milesToKilometers();
					break;
				case "2":
					System.out.println("Feet to Meters");
					feetToMeter();
					break;
				case "3":
					System.out.println("Inches to Centimeters");
					inchToCentimeter();
					break;
				 case "4":
					 main(null);
					break;
				default:
					System.out.println("\nPlease type your choice number from 1 to 3 or press 4 to go back to the main menu."); 
					isValid = false;	
				}
		  }
		
	  }
	  
	  //case1 Miles to Kilometers
	  private static void milesToKilometers() {
			System.out.println("Please enter the amount in Miles:"); 
			@SuppressWarnings("resource")
			Scanner milesAmount = new Scanner(System.in);
			double miles = 0.0;
			miles = milesAmount.nextDouble();
			double kilometers = 0.0;
			kilometers = miles * 1.609;
			System.out.println(miles+" miles equals "+kilometers+" kilometers.");
			System.out.println("===========================\n");	
		  }
	  
	  //case2 Feet to Meters  
	  private static void feetToMeter() {
			System.out.println("Please enter the amount in Foot:"); 
			@SuppressWarnings("resource")
			Scanner feetAmount = new Scanner(System.in);
			double foot = 0.0;
			foot = feetAmount.nextDouble();
			double meter = 0.0;
			meter = foot / 3.281;
			System.out.println(foot+" feet equals "+meter+" meters.");
			System.out.println("===========================\n");	
		  }
	  //case3 Inches to Centimeters 
	  private static void inchToCentimeter() {
			System.out.println("Please enter the amount in Inches:"); 
			@SuppressWarnings("resource")
			Scanner inchAmount = new Scanner(System.in);
			double inch = 0.0;
			inch = inchAmount.nextDouble();
			double cm = 0.0;
			cm = inch * 2.541;
			System.out.println(inch+" inches equals "+cm+" cm.");
			System.out.println("===========================\n");	
		  }
	  
	  
//====================================================================================================//
	   
	  private static void fuelEconomyConverter() {
		  while(!isValid) {
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
			
				String menuSelection = " ";	
				
				System.out.println("Please select an option:");
				System.out.println("1. Imperial to miles per gallon converter\r\n"
						+ "2. Miles per Gallons converter\r\n"
						+ "3. Imperial to km/liter converter\r\n"
						+ "4. Go back to the main menu");
			
				menuSelection = input.nextLine();
				
				switch(menuSelection) {
				case "1":
					System.out.println("Imperial to miles per gallon converter");
					gallonsConversions();
					break;
				case "2":
					System.out.println("Miles per Gallons converter.");
					literConversions();
					break;
				case "3":
					System.out.println("Imperial to km/liter converter");
					imperialKmConversions();
					break;
				 case "4":
					 main(null);
					break;
				default:
					System.out.println("\nPlease type your choice number from 1 to 3 or press 4 to go back to the main menu."); 
					isValid = false;	
				}
		  }
		
	  }
	  //case1 Imperial to/gallon converter
	private static void gallonsConversions() {
		System.out.println("Please enter the amount in Imperial Gallons:"); 
		@SuppressWarnings("resource")
		Scanner igallonsAmount = new Scanner(System.in);
		double igallons = 0.0;
		igallons = igallonsAmount.nextDouble();
		double gallons = 0.0;
		gallons = igallons / 1.201;
		System.out.println(igallons+" Imperial Gallons equals."+gallons+" Gallons.");
		System.out.println("===========================\n");
	  }
	  
	  //case2 miles/gallon to kilometer/liter 
	  private static void literConversions() {
			System.out.println("Please enter the amount in Miles per Gallons:"); 
			@SuppressWarnings("resource")
			Scanner mpgallonsAmount = new Scanner(System.in);
			double mpgallons = 0.0;
			mpgallons = mpgallonsAmount.nextDouble();
			double kmpLitter = 0.0;
			kmpLitter = mpgallons / 2.352;
			System.out.println(mpgallons+" miles/gallon equals."+kmpLitter+" kilometer/liter.");
			System.out.println("===========================\n");
		  }
	//case3 Imperial to km/liter converter
	  private static void imperialKmConversions() {
			System.out.println("Please enter the amount in Imperial Gallons:"); 
			@SuppressWarnings("resource")
			Scanner impgallonsAmount = new Scanner(System.in);
			double impgallons = 0.0;
			impgallons = impgallonsAmount.nextDouble();
			double kmpLitter = 0.0;
			kmpLitter = impgallons / 2.825;
			System.out.println(impgallons+" Imperial Gallon equals."+kmpLitter+" kilometer/liter.");
			System.out.println("===========================\n");
		  }
	  
	  
	  
}
