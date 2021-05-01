
public class Pineapple extends Fruits {
	private int number;
	private double weight = 1.3, price;
		Pineapple(){
		super();
		this.name = "pineapple";
		System.out.println("Pineapple is constructed");
		System.out.println("Price per kg of pineapple = " + CalculatePrice());
		System.out.println("Weight per pineapple = " + weight + "kg");
		System.out.print("Please enter the amount of pineapple you want: ");
		number = scan.nextInt();
	}
	
	public double CalculatePrice(int number, double weight) {
		return price = number * weight * CalculatePrice();
	}

	
	public String toString() {
		return ("Total Price of Durian = RM" + CalculatePrice(number,weight) );
	}
}