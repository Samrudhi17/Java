package com.demo.model;

public class SalariedEmp extends Employee{
	
	private double sal;
	private double bonus;
	
	public SalariedEmp() {
		super();
		
	}
	
	public SalariedEmp(int id, String name, String mob, String dept, String desg,double sal) {
		super(id,name,mob,dept,desg);
		this.sal = sal;
		this.bonus = sal*0.10;
	}
	
	public Double getSal() {
		return sal;
	}
	
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	public Double getBonus() {
		return bonus;
	}
	
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [ Sal = " + sal + "Bonus = "+ bonus + "]"; 
	}
	
	
	public double CalculateSal() {
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}
	
	
	public double CalculateBonus(float perc) {
		bonus = sal * perc;
		return bonus;
	}
	


}
