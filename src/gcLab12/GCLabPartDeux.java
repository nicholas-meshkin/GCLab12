package gcLab12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GCLabPartDeux {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		List<Car> carMenu = new ArrayList<>();
		List<Car> carsBought = new ArrayList<>();
		int userSelection = 0;
		String userCont = "y";
		String userBuy = "y";

		carMenu.add(new Car("Mitsubishi", "FastBoy", 2017, 65400.00));
		carMenu.add(new Car("Subaru", "DoubleCar", 2015, 83500.00));
		carMenu.add(new Car("Tesla", "SpaceBus", 2020, 500007.55));
		carMenu.add(new UsedCar("Hyundai", "TallVan", 1999, 12700.00, 30487.10));
		carMenu.add(new UsedCar("Toyota", "Bigraft", 1979, 5400.00, 320549.58));
		carMenu.add(new UsedCar("Ford", "Model T", 1923, 12500.00, 54287.36));

		while (userCont.equalsIgnoreCase("y")) { // goes while user still wants to look at car list
			System.out.println("Current inventory:");

			for (int i = 0; i < carMenu.size(); i++) { // prints out current list of cars with numbers as selectors
				System.out.print((i + 1) + ": ");
				System.out.println(carMenu.get(i));
			}
			System.out.println(carMenu.size() + 1 + ": Quit");

			userSelection = Validator.getInt2(scnr, "Which car would you like?", 1, carMenu.size() + 1); 
			//needed to make getInt2 to have different bad input message
			
			if (userSelection > carMenu.size()) { // only triggers if user enters the number for the quit option
				System.out.println("You purchased:");
				double total = 0.0;
				for (Car boughtCar : carsBought) { // prints list of cars bought
					System.out.println(boughtCar);
					total+=boughtCar.getPrice();
				}
				System.out.print("Your total is $");
				System.out.printf("%.2f", total);  //prints purchase total
				System.out.println(" Thank you for shopping with us, and have a great day!");
				userCont = "n";
			} else {
				System.out.println(carMenu.get(userSelection - 1)); // prints car info at index that is paired with
																	// selector
				userBuy = Validator.getString(scnr, "Would you like to buy this car? (y/n)");
				if (userBuy.equalsIgnoreCase("y")) {
					carsBought.add(carMenu.get(userSelection - 1));
					carMenu.remove(userSelection - 1); // removes the car from the list if they want to buy it
					System.out.println("Thank you for your purchase.");
				}
			}
		}

		scnr.close();
	}

}
