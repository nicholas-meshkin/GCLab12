package gcLab12;

public class Car {
protected String make;
protected String model;
protected int year;
protected double price;


public Car() {
	super();
}

public Car(String make, String model, int year, double price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
}

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	
//	return String.format("%-6s%-10s%-6s%-10s%-6s%-5d%-6s%10.2f","make = ", make , " model = " , model , " year = " , year , " price = $" , price) ;
	return String.format("%-10s%-10s%-5d%2s%10.2f",  make,  model, year, "$", price);
}

}
