package model;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import model.Persona;

public class Main {

	private static SessionFactory sf;
	private static Configuration cfg; 
	private static Session session;
	private static Transaction tx;
	private static Persona pepe;
	
	public static void main(String[] args) {
		setUp();
		session = sf.openSession();
		tx = session.beginTransaction();
		@SuppressWarnings("unused")
		Long id = (Long) session.save(pepe);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("deprecation")
	public static void setUp() {
		cfg = new Configuration().configure("hibernate/hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		pepe = new Persona(0,"pepe",0,"pepe@gmail.com","calle false 123");
	}
	
	
}
