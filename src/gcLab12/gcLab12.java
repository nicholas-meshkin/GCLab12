package gcLab12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class gcLab12 {

	public static void main(String[] args) {
		int userCars = 0;
		List<Car> userCarList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to CarTracker!");
		userCars = Validator.getInt(scnr, "How many cars would you like to add?");

		for (int i = 0; i < userCars; i++) { //keeps asking for info until number of cars the user requested has been reached
			userCarList.add(getCar());
		}
		System.out.println("Current inventory:");
		for (Car thisCar : userCarList) {
			System.out.println(thisCar);
		}

		scnr.close();
	}

	public static Car getCar() { // asks user for information on cars
		Scanner scnr = new Scanner(System.in);
		Car myCar = new Car();
		myCar.setMake(Validator.getString(scnr, "Please enter the make of the car:"));
		myCar.setModel(Validator.getString(scnr, "Please enter the model of the car:"));
		myCar.setYear(Validator.getInt(scnr, "Please enter the year of the car:", 1885, 2021)); //first car was in 1885
		myCar.setPrice(Validator.getDouble(scnr, "Please enter the price of the car:", 1.00, 1000000000.00)); // don't wanna give cars away
		return myCar;
	}
}
