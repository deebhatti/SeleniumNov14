package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("London");
		cities.add("New York");
		cities.add("Singapore");
		
		for (String t : cities) {
			System.out.println(t);
		}
		
		System.out.println();
		
		System.out.println("Element present at index 1 = " + cities.get(1));
		System.out.println("Index of Tokyo = " + cities.indexOf("Tokyo"));
		System.out.println("Total elements in the arraylist = " + cities.size()); 
		System.out.println("Is New Delhi present in the list  = " + cities.contains("New Delhi"));
		
	}

}
