package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("samsung");
		mobile.setCost(24000);

//		Mobile mobile1 = new Mobile();
//		mobile1.setName("Redmi");
//		mobile1.setCost(14000);

		Sim sim1 = new Sim();
		sim1.setName("airtel 2");
		sim1.setProvider("AIRTEL");
		sim1.setMobile(mobile);

		Sim sim2 = new Sim();
		sim2.setName("airtel 3");
		sim2.setProvider("AIRTEL");
		sim2.setMobile(mobile);
		List<Sim> list1=new ArrayList();
		list1.add(sim1);
		list1.add(sim2);
		mobile.setList(list1);
	//	List<Sim> list2=new ArrayList();

//		Sim sim3 = new Sim();
//		sim3.setName("jiO1");
//		sim3.setProvider("JIO");
//
//		Sim sim4 = new Sim();
//		sim4.setName("Bsnl1");
//		sim4.setProvider("BNSL");
//		list2.add(sim3);
//		list2.add(sim4);
//		mobile1.setList(list2);
		
		
		entityTransaction.begin();
		entityManager.persist(mobile);
//		entityManager.persist(mobile1);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
//		entityManager.persist(sim3);
//		entityManager.persist(sim4);
		entityTransaction.commit();
		
	}

}
