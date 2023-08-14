package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		// List<Object> is not the supertype of any specific type of list 
		List<Object> myObjects = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		
		// Therefore, List<Integer> can't be assigned to List<Object>
		// myObjects = myNumbers;
		
		// The supertype of any kind of list is List<?>
		List<?> myObjects2 = new ArrayList<>();
		List<Integer> myNumber2 = new ArrayList<>();
		
		// Therefore, List<Integer> can be assigned to List<?>
		myObjects2 = myNumber2;
	}
}