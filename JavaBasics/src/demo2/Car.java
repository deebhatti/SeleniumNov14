package demo2;

public class Car extends Calculator {
	
	String color;
	int spokes;
	
	public Car() {
		color = "Red";
		spokes = 8;
	}
	
	public Car(String color, int spokes) {
		this.color = color;
		this.spokes = spokes;	
	}
	
	public static void numberOfSteeringWheels() {
		System.out.println("Number of Steering Wheels = 1");
	}
	
	public void printCarInfo() {
		System.out.println("Color of the Car = " + color + " and number of spokes = " + spokes);
	}
	
	public static void main(String[] args) {
		Car Audi = new Car("White",5);
		Car Mercedes = new Car("Black",10);
		Car BMW = new Car();
	
		BMW.printCarInfo();
		numberOfSteeringWheels();
		
	}

}
