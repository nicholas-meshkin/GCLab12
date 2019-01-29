package gcLab12;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class GCLabPartDeux {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		List<Car> carMenu = new ArrayList<>();
		int userSelection = 0;
		String userCont = "y";
		String userBuy = "y";
	
		carMenu.add(new Car("Mitsubishi","FastBoy",2017,65400.00));
		carMenu.add(new Car("Subaru","DoubleCar",2015,83500.00));
		carMenu.add(new Car("Tesla","SpaceBus",2020,500007.55));
		carMenu.add(new UsedCar("Hyundai","TallVan",1999,12700.00, 30487.10));
		carMenu.add(new UsedCar("Toyota","Bigraft",1979,5400.00, 320549.58));
		carMenu.add(new UsedCar("Ford","Model T",1923,12500.00,54287.36));
		
		while(userCont.equalsIgnoreCase("y")) {
			System.out.println("Current inventory:");
			List<Integer> selection = new ArrayList<>();
			for (int i=0;i<carMenu.size();i++) {
				selection.add(i+1);
			}
			for(int i=0;i<carMenu.size();i++) {
				System.out.print((i+1) + ": ");
				System.out.println(carMenu.get(i));
			}
			System.out.println(carMenu.size()+1 + ": Quit");
			
			userSelection = Validator.getInt2(scnr, "Which car would you like?", 1, carMenu.size()+1);
			if(userSelection>carMenu.size()) {
				System.out.println("Have a great day!");
				userCont = "n";
			}else {
				System.out.println(carMenu.get(userSelection-1));
				userBuy = Validator.getString(scnr, "Would you like to buy this car?");
				if(userBuy.equalsIgnoreCase("y")) {carMenu.remove(userSelection-1);
				System.out.println("Thank you for your purchase.");
				}
			}
		}
		
		
		
		scnr.close();
	}

}
