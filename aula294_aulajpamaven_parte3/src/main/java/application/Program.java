package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {
	public static void main(String[] args) {
		Person p1 = new Person(null, "Olivia", "olivia@gmail.com");
		Person p2 = new Person(null, "Noah", "noah@gmail.com");
		Person p3 = new Person(null, "Amelia", "amelia@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}
}