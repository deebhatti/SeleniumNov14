package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		try {
			System.out.println("Please enter a number");
			int num1 = k.nextInt();

			System.out.println("Please enter another number");
			int num2 = k.nextInt();

			System.out.println("The result of division of " + num1 + " and " + num2 + " = " + (num1 / num2));
		}

		catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in the denominator");
		}

		catch (InputMismatchException e) {
			System.out.println("Only integer values are accepted. Please enter an integer value only.");
		}

		catch (Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		finally {
			k.close();
			System.out.println("This will always be executed.");
		}

		

	}

}
