package com.capgemini.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmp {
public static void main(String[] args) {
	
	
	EntityManagerFactory emf = new Persistence().createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = emf.createEntityManager();
	manager.getTransaction().begin();
	
	Employee emp = new Employee();
	emp.setE_id(103);
	emp.setE_name("Dinga");
	emp.setE_salary(9000);
	emp.setE_password("root");
	
	manager.persist(emp);
	
	
	manager.getTransaction().commit();
	manager.close();
	
	
	
	
}
}
