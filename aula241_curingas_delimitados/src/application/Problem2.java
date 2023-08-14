package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem2 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	// List<? extends Number> -> any specific type of list that is a subtype of Number
	// List<? super Number> -> any specific type of list that is a supertype of Number
	// List<? extends Number> -> covariance
	// List<? super Number> -> contravariance
	public static void copy(List<? extends Number> source, List<? super Number> destination) {
		for (Number n : source) {
			destination.add(n);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}