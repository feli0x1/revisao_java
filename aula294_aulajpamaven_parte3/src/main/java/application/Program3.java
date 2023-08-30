package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Person p1 = em.find(Person.class, 4);
		Person p2 = em.find(Person.class, 5);
		Person p3 = em.find(Person.class, 6);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		em.getTransaction().begin();
		em.remove(p1);
		em.remove(p2);
		em.remove(p3);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}
}