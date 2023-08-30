package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p1 = em.find(Person.class, 1);
		Person p2 = em.find(Person.class, 2);
		Person p3 = em.find(Person.class, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}
}