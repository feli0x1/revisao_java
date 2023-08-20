package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 10, 15, 20);
		
		// Stream creation from a collection
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = list.stream().map(x -> x * 2);
		System.out.println(Arrays.toString(stream1.toArray()));
		System.out.println(Arrays.toString(stream2.toArray()));
		
		// Stream creation from Stream.of()
		Stream<String> stream3 = Stream.of("John", "James", "Joseph", "David", "Benjamin");
		System.out.println(Arrays.toString(stream3.toArray()));
		
		// Stream creation from Stream.iterate()
		Stream<Integer> stream4 = Stream.iterate(2, x -> x + 2);
		System.out.println(Arrays.toString(stream4.limit(10).toArray())); 
		
		Stream<Long> stream5 = Stream.iterate(new Long[] {0L, 1L}, 
				y -> new Long[] {y[1], y[0]+y[1]})
				.map(y -> y[0]); 
		System.out.println(Arrays.toString(stream5.limit(20).toArray()));
	}
}