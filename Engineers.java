package io.springboot;

public class Engineers {
	
	private String name;
	private String profile;
	private double salary;
	
	
	public Engineers(String name, String profile, double salary) {
		super();
		this.name = name;
		this.profile = profile;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
