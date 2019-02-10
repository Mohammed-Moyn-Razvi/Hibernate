package com.capgemini.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmp {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee emp = manager.find(Employee.class, 102);

		manager.remove(emp);
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}
}
