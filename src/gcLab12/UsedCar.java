package gcLab12;

public class UsedCar extends Car {
	protected double mileage = 0.0;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {

		return String.format("%-10s%-10s%-5d%2s%10.2f%10.1f%-12s",  make,  model,
				 year, "$", price, mileage, " miles (Used)");
	}
}
