package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FoodOrderDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Dimple");
		foodOrder.setStatus("preparing");
		
		Iteam iteam = new Iteam();
		iteam.setName("Burger");
		iteam.setQuantity(2);
		iteam.setCost(200);
		
		Iteam iteam1 = new Iteam();
		iteam1.setName("Freanch fries");
		iteam1.setQuantity(3);
		iteam1.setCost(250);
		
		List<Iteam> l = new ArrayList();
		l.add(iteam);
		l.add(iteam1);
		
		foodOrder.setIteam(l);
		
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityManager.persist(iteam);
		entityManager.persist(iteam1);
		entityTransaction.commit();
	}

}
