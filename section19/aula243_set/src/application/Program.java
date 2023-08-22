package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println();
		Set<String> set2 = new TreeSet<>();
		
		set2.add("C");
		set2.add("B");
		set2.add("A");
		
		for (String s : set2) {
			System.out.println(s);
		}
		
		System.out.println();
		Set<Character> set3 = new LinkedHashSet<>();
		
		set3.add('h');
		set3.add('g');
		set3.add('f');
		set3.add('e');
		set3.add('D');
		set3.add('C');
		set3.add('B');
		set3.add('A');
		
		for (Character c : set3) {
			System.out.println(c);
		}
		
		set3.remove('A');
		System.out.println(set3);
		set3.removeIf(c -> Character.isUpperCase(c));
		System.out.println(set3);
	}
}