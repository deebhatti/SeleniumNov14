package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> td = new HashMap<>();
		
		td.put("Tim", 123456);
		td.put("Sam", 234567);
		td.put("Ram", 345678);
		td.put("Tim", 123456);
		td.put("Paul", 2345678);
		td.put("Deepinder", 4566541);
		
		for(Map.Entry m : td.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

		
		
	}

}
