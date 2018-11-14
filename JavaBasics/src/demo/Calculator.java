package demo;

public class Calculator {
	
	public Calculator() {
		
	}
	
	public void add(int a, int b) {// a and b are called as Formal Parameters
		System.out.println("Result of adding " + a + " + " + b + " = " + (a + b));
	}

	public int subtract(int a, int b) {
		return(a-b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
				
		System.out.println(basicCal.subtract(100, 10));
		
		
		
		
		
		
		
		
		
	}
	
}
