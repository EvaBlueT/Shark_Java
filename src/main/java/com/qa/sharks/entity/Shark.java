package com.qa.sharks.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private int numberOfKids;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column
	private String habitat;
		
	
	//Default constructor
	public Shark() {}

	//For creating Sharks
	public Shark(int numberOfKids, String name, String habitat) {
		super();
		this.numberOfKids = numberOfKids;
		this.name = name;
		this.habitat = habitat;
	}
	
	//For testing
	public Shark(long id, int numberOfKids, String name, String habitat) {
		super();
		this.id = id;
		this.numberOfKids = numberOfKids;
		this.name = name;
		this.habitat = habitat;

}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumberOfKids() {
		return numberOfKids;
	}

	public void setNumberOfKids(int numberOfKids) {
		this.numberOfKids = numberOfKids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Shark [id=" + id + ", numberOfKids=" + numberOfKids + ", name=" + name + ", habitat=" + habitat + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(habitat, id, name, numberOfKids);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shark other = (Shark) obj;
		return Objects.equals(habitat, other.habitat) && id == other.id && Objects.equals(name, other.name)
				&& numberOfKids == other.numberOfKids;
	}
	
	
}
