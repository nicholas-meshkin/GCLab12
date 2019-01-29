package gcLab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarLotApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Car> carMenu = new ArrayList<>();
		carMenu.add(new Car("Mitsubishi", "FastBoy", 2017, 65400.00));
		carMenu.add(new Car("Subaru", "DoubleCar", 2015, 83500.00));
		carMenu.add(new Car("Tesla", "SpaceBus", 2020, 500007.55));
		carMenu.add(new UsedCar("Hyundai", "TallVan", 1999, 12700.00, 30487.10));
		carMenu.add(new UsedCar("Toyota", "Bigraft", 1979, 5400.00, 320549.58));
		carMenu.add(new UsedCar("Ford", "Model T", 1923, 12500.00, 54287.36));
		CarLot myLot = new CarLot(carMenu); //populating initial menu
		
		String userCont = "y";
		int userChoice = 0;
		ArrayList<String> options = new ArrayList<>();
		options.add("List all cars");
		options.add("Add a car");
		options.add("Remove a Car");
		options.add("Look at specific car");
		options.add("Replace a specific car");
		System.out.println("Welcome to Car Lot Manager!");
		while (userCont.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.println("Here are your options:");
			for (int i = 0; i < options.size() + 1; i++) {
				if (i < options.size()) {
					System.out.print((i + 1) + ": ");
					System.out.println(options.get(i));
				} else {
					System.out.println((i + 1) + ": Quit");
				}
			}
			System.out.println();
			userChoice = Validator.getInt2(scnr, "Please enter your selection.", 1, options.size() + 1);
			if (userChoice == 1) {
				myLot.printListAndNums();
			} else if (userChoice == 2) {
				myLot.addCar(); // adds car to list
			} else if (userChoice == 3) {
				myLot.removeCar(); // removes car from list
			} else if (userChoice == 4) {
				myLot.getCar(); // gets details of car from list
			} else if (userChoice == 5) {
				myLot.replaceCar();  // replaces car on list
			} else {
				userCont = "n";
			}
		}
		System.out.println("Goodbye!");
	}

}
