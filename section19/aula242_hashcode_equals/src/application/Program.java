package application;

import model.entities.Client;

public class Program {
	public static void main(String[] args) {
		String a = "John";
		String b = "Zeph";
		
		System.out.printf("%s equals to %s? %b\n", a, b, a.equals(b));
		System.out.printf("%s == to %s? %b\n", a, b, a == b);
		System.out.println("John's hashcode is " + a.hashCode());
		System.out.println("Zeph's hashcode is " + b.hashCode());
		
		Client client1 = new Client("Alex", "alex@gmail.com");
		Client client2 = new Client("John", "john@gmail.com");
		Client client3 = new Client("Alex", "abcdef@gmail.com");
		Client client4 = new Client("Alex", "alex@gmail.com");
		
		System.out.println();
		System.out.printf("(%s) %s's hashcode is %d\n", client1.getEmail(), client1.getName(), client1.hashCode());
		System.out.printf("(%s) %s's hashcode is %d\n", client2.getEmail(), client2.getName(), client2.hashCode());
		System.out.printf("%s equals to %s? %b\n", client1.getName(), 
				client2.getName(), client1.equals(client2));
		System.out.printf("(%s) %s equals to (%s) %s? %b\n", client1.getEmail(), client1.getName(), 
				client3.getEmail(), client3.getName(), client3.equals(client1));
		System.out.printf("(%s) %s equals to (%s) %s? %b\n", client1.getEmail(), client1.getName(), 
				client4.getEmail(), client4.getName(), client4.equals(client1));
		
		// The difference between the equals() and == is that
		// equals() compares each object's data, whereas
		// the == operator compares the object's references.
		System.out.printf("(%s) %s == (%s) %s? %b\n", client1.getEmail(), client1.getName(), 
				client4.getEmail(), client4.getName(), client4 == client1);	
		
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2);
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		System.out.println(s3 == s4);
	}
}