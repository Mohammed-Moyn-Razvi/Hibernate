package com.capgemini.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadDeatils {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = emf.createEntityManager();
		
		manager.getTransaction().begin();
		
	Employee emp = 	manager.find(Employee.class,102);
				
		System.out.println("Name of employee :"+emp.getE_name());
		System.out.println("Password of employee :"+emp.getE_password());
		System.out.println("Salary of employee :"+emp.getE_salary());
		
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
		
		
		
	}
}
