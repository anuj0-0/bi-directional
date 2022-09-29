package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setName("Manipal");
		hospital.setWebsite("manipal.com");

//		Branch branch = new Branch();
//		branch.setLocation("sfsdvs");
//		branch.setCity("Blr");
//		branch.setPhone(25626262);
		
		Branch branch1 = new Branch();
		branch1.setLocation("B.Road");
		branch1.setCity("Blr");
		branch1.setPhone(56446613);
		
		Branch branch2 = new Branch();
		branch2.setLocation("MG Road");
		branch2.setCity("Blr");
		branch2.setPhone(987456985);
		List<Branch> list=new ArrayList();
		list.add(branch1);
		list.add(branch2);
		hospital.setList(list);
		
		
//		branch.setHospital(hospital);
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
//		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
		
	}

}
