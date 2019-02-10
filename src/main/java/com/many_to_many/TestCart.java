package com.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCart {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Item i1 = new Item();
		i1.setItem_id(101);
		i1.setItem_name("Product 1");
		
		Item i2 = new Item();
		i2.setItem_id(102);
		i2.setItem_name("Product 2");
		
		Set<Item>i = new HashSet<>();
		i.add(i1);
		i.add(i2);
		
		Cart c1 = new Cart();
		c1.setCart_id(100001);
		c1.setCart_name("Amazon");
		c1.setIt(i);
		manager.persist(c1);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
	}
}
