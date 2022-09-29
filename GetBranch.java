package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Branch branch= entityManager.find(Branch.class, 1);
		System.out.println(branch.getId());
		System.out.println(branch.getLocation());
		System.out.println(branch.getCity());
		System.out.println(branch.getPhone());
		
		Hospital hospital=branch.getHospital();
		System.out.println(hospital.getId());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		
		Hospital hospital2=entityManager.find(Hospital.class, 1);
		
		System.out.println(hospital.getId());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		
		List<Branch> branch2=hospital2.getList();
		System.out.println(branch.getId());
		System.out.println(branch.getLocation());
		System.out.println(branch.getCity());
		System.out.println(branch.getPhone());
	
		
	}
}
