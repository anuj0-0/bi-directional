package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String status;
	@OneToMany
	private List<Iteam> iteam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Iteam> getIteam() {
		return iteam;
	}

	public void setIteam(List<Iteam> iteam) {
		this.iteam = iteam;
	}

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", to=" + name+ ", status=" + status + ", iteam=" + iteam + "]";
	}

}
