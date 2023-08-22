package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> st1 = list.stream().map(x -> x * 2);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> list2 = list.stream()
				.filter(x -> x % 2 == 1)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(list2);
	}
}