package application;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		// Covariance
		List<? extends Number> list = intList;
		
		// get is allowed
		Number x = list.get(0);
		
		// put isn't
		// Test:
		// list.add(20);
		// Compile-time error
	}
}