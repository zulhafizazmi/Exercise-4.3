import java.util.Scanner;

public class Fruits {
	Scanner scan = new Scanner(System.in);
	protected String name;
	protected double price, discountprice;
	public Fruits() {
			System.out.println("Fruits constructor is invoked");
		
	}
	
	public String CreateFruits() {
		System.out.print("Please choose the fruits you want (Banana/Pineapple): ");
		this.name = scan.nextLine();
		while (this.name.equalsIgnoreCase("Banana")== false && this.name.equalsIgnoreCase("Pineapple")==false) {
			System.out.println("Wrong Input! Please choose Banana or Pineapple only!");
			System.out.print("Please choose the fruits you want (Banana/Pineapple): ");
			this.name = scan.nextLine();
		}
		return this.name;
	}
	
	public double CalculatePrice() {
		if (this.name.equalsIgnoreCase("Banana")) {
			this.price = 1.3;
		}
		else if (this.name.equalsIgnoreCase("Pineapple")) {
			this.price = 1.5;
		}
		return this.price;
	}

	public String toString() {
		return (CreateFruits() + " is constructed \n" + "Price of " + this.name + " = RM" + CalculatePrice());
	}
}