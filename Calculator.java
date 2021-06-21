package io.springboot.model;

public class Calculator {
	
	private int addition;
	private int substraction;
	private int multiplication;
	private int division;
	
	
	public Calculator(int addition, int substraction, int multiplication, int division) {
		super();
		this.addition = addition;
		this.substraction = substraction;
		this.multiplication = multiplication;
		this.division = division;
	}
	public int getAddition() {
		return addition;
	}
	public void setAddition(int addition) {
		this.addition = addition;
	}
	public int getSubstraction() {
		return substraction;
	}
	public void setSubstraction(int substraction) {
		this.substraction = substraction;
	}
	public int getMultiplication() {
		return multiplication;
	}
	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	
	

}
