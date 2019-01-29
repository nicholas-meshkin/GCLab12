package gcLab12;
import java.util.Scanner;
import java.util.ArrayList;
public class CarLot {
	protected ArrayList<Car> carList = new ArrayList<>();
	public CarLot() {
		
	}
	public CarLot(ArrayList<Car> carList) {
		this.carList = carList;
	}
	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	public void printList() {
		System.out.println("Current inventory:");
		for(Car myCar : carList) {
			System.out.println(myCar);
		}
	}
	public void printListAndNums() {
		System.out.println("Current inventory:");
		for(int i =0; i<carList.size();i++) {
			System.out.print((i + 1) + ": ");
			System.out.println(carList.get(i));
		}
	}
	
	public void addCar() {
	
		carList.add(gcLab12.getCar());
	}
	
	public void getCar() {
		Scanner scnr = new Scanner(System.in);
		int carChoice = Validator.getInt2(scnr, "Which car would you like to examine?", 1, carList.size());
		System.out.println(carList.get(carChoice-1));
	}
	public void removeCar() {
		Scanner scnr = new Scanner(System.in);
		int carChoice = Validator.getInt2(scnr, "Please select a car to remove", 1, carList.size());
		carList.remove(carChoice-1);
	}
	public void replaceCar() {
		Scanner scnr = new Scanner(System.in);
		int carChoice = Validator.getInt2(scnr, "Please select a car to replace", 1, carList.size());
		carList.remove(carChoice-1);
		carList.add(carChoice-1,gcLab12.getCar());
	}
	
}
