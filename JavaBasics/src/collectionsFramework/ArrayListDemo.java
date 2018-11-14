package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("London");
		cities.add("New York");
		cities.add("Singapore");
		cities.add("Paris");
		
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
