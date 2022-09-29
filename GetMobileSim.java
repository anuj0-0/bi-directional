package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("*******************MOBILE INFO************************");
		System.out.println("Id :" + mobile.getId());
		System.out.println("cost :" + mobile.getCost());
		System.out.println("Name :" + mobile.getName());
		List<Sim> l = mobile.getList();
		int i = 1;
		for (Sim k : l) {
			System.out.println("**********************SIM " + i + " INFO**********************");
			System.out.println("Id :" + k.getId());
			System.out.println("Name :" + k.getName());
			System.out.println("Provider :" + k.getProvider());
			i++;
		}
		Sim sim = entityManager.find(Sim.class, 1);

		System.out.println("**********************SIM " + i + " INFO**********************");
		System.out.println("Id :" + sim.getId());
		System.out.println("Name :" + sim.getName());
		System.out.println("Provider :" + sim.getProvider());
		Mobile mobile2 = sim.getMobile();
		System.out.println("*******************MOBILE INFO************************");
		System.out.println("Id :" + mobile.getId());
		System.out.println("cost :" + mobile.getCost());
		System.out.println("Name :" + mobile.getName());
	}

}
