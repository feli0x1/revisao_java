package application;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("A", "B", "C");
		printList(myStrings);
	}

	// print ANY sort of list
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

//	public static void printList(List<Object> list) {
//		for (Object obj : list) {
//			System.out.println(obj);
//		}
//	}
}