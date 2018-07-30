package CarStore;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String make;
		String model;
		int year;
		double price;
		double mileage;
		int listNum = 1;
		int carNum;
		String response = "n";
		ArrayList<Car> carList = new ArrayList<>();
		
		System.out.println("Welcome to the Grand Circus Motors admin console!\n");
		
		//Used for part 1 of the lab
		
//		System.out.println("How many cars are you entering: ");
//		int userNum = scan.nextInt();
//		scan.nextLine();
//		
//		for (int i = 0; i < userNum; i++) {
//			carNum = i + 1;
//
//			make = Validator.getString(scan, "Please enter the make for the " + carNum + "º car: ");
//			
//			model = Validator.getString(scan, "Please enter the model for the " + carNum + "º car: ");
//			
//			year = Validator.getInt(scan, "Please enter the year for the " + carNum + "º car: ");
//			
//			price = Validator.getDouble(scan, "Please enter the price for the " + carNum + "º car: \n");
//
//			System.out.println("Is this car used? (y/n)");
//				response = scan.nextLine();
//			if(response.equalsIgnoreCase("y")) {
//				mileage = Validator.getDouble(scan, "Please enter the mileage for the " + carNum + "º car: \n");
//				carList.add(new UsedCars(make, model, year, price, mileage));
//			} else {
//				carList.add(new Car(make, model, year, price));
//			}
//			
//		}
		
		//Part 2 
		
		carList.add(new Car("Nikolai", "S", 2017, 54999.90));
		carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		carList.add(new UsedCars("GC", "Chirpus", 2013, 8500.00, 35987.6));
		carList.add(new Car("Chewie", "Vette", 2017, 44989.95));
		carList.add(new UsedCars("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		carList.add(new UsedCars("GC", "Whiterell", 2016, 14450.00, 3500.3));
		

		do {
			System.out.printf("%-14s %-10s %-10s %-10s", "Make", "Model", "Year", "Price");
			System.out.println();
			
			for (int i = 0; i < carList.size(); i++) {
				System.out.println(listNum + ". " + carList.get(i));
				listNum++;
			}
			
			System.out.println("7. Quit \n");
			
			System.out.println("Which car would you like");
			carNum = scan.nextInt();
			scan.nextLine();
			
			if (carNum < carList.size()) {
				System.out.println(carList.get(carNum - 1));
				System.out.println("\nWould you like to buy this car? (y/n)");
				response = scan.nextLine();
				
				if (response.equalsIgnoreCase("y")) {
					System.out.println("\nExcelent! Our finance department will be in touch shortly.\n\n");
				}
			} 
			
		} while (carNum != 7);
		
		System.out.println("\n Have a great day!");
		
	}

}
