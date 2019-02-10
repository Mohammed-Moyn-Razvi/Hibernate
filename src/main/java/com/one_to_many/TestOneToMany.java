package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
        
		Pencil p1 = new Pencil();
		p1.setPname("Apsara");
		
		Pencil p2 = new Pencil(); 
		p2.setPname("Nataraj");
		
		Pencil p3 =  new Pencil();
		p3.setPname("shakalaka boom boom");
		
		PencilBox pb = new PencilBox();
		pb.setBox_cap(5);
		
		List<Pencil>pen = new ArrayList<>();
		pen.add(p1);
		pen.add(p2);
		pen.add(p3);
		
		pb.setPen(pen);
		
		manager.persist(pb);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
				
	}
}
