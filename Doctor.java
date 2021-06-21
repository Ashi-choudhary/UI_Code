package io.springboot.model;

public class Doctor {
	
	private String name;
	private int experience;
	private int age;
	
	
	public Doctor(String name, int experience, int age) {
		super();
		this.name = name;
		this.experience = experience;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(byte experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	

}
