package com.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUserPAss {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Usertable us = new Usertable();
		us.setUserid(1);
		us.setUsername("Pinki");
		us.setAge(18);

		PassportTable p = new PassportTable();
		p.setPid(10001);
		p.setName("Indian Passport");
		p.setUs(us);

		manager.persist(p);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
