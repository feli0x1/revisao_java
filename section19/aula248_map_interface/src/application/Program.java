package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		// Adding elements
		cookies.put("username", "john");
		cookies.put("email", "john@gmail.com");
		cookies.put("phone", "998543051");
		cookies.put("phone2", "328439621");
		
		for (String key : cookies.keySet()) {
			System.out.println("key : " + key);
		}
		
		// Removing element based on the key
		cookies.remove("phone2");
		
		System.out.println("key 'phone2' exists? " + cookies.containsKey("phone2"));
		
		System.out.println();
		
		// Iterate through map
		for (String key : cookies.keySet()) {
			System.out.printf("%s: %s\n", key, cookies.get(key));
		}
		
		String oldPhoneNumber = cookies.get("phone");
		cookies.put("phone", "123123123");
		System.out.println();
		System.out.println("Old phone number = " + oldPhoneNumber);
		System.out.println("New phone number (the old one was overwritten): " + cookies.get("phone"));
		System.out.println("Key 'phone2' = " + cookies.get("phone2"));
		System.out.println("Map size = " + cookies.size());
	}
}