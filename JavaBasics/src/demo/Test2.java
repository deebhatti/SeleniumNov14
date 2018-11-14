package demo;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Please enter your age:");
		int age = k.nextInt();

		System.out.println("Please enter your name:");
		String name = k.nextLine();

		System.out.println("Your name = " + name + " and your age = " + age);
	}

}
