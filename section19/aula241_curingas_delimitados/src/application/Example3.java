package application;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		// Contravariance
		List<? super Number> myNums = myObjs;
		
		// get isn't allowed
		// put is allowed
		myNums.add(10);
		myNums.add(3.14);
		
		// Test:
		// Number x = myNums.get(0);
	}
}
