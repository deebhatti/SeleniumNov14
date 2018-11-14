package loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int correctPIN = 1234;

		System.out.println("Please enter your PIN :");
		int enteredPIN = k.nextInt();

		while (enteredPIN != correctPIN) {
			System.out.println("Incorrect PIN. Please enter your PIN again");
			enteredPIN = k.nextInt();
		}

		System.out.println("Welcome to ABC Bank");

	}

}
