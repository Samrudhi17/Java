package com.demo.model;

public class ContractEmp extends Employee {
	
	private float hr;
	private double charges;
	
	public ContractEmp() {
		super();
	}
	
	public ContractEmp(int id, String nm, String mob, String dept, String desg, float hr, double charges) {
		super(id,nm,mob,dept,desg);
		this.hr = hr;
		this.charges = charges;
		
	}
	
	public float getHr() {
		return hr;
	}
	
	public void setHr(float hr) {
		this.hr = hr;
	}
	
	public double getCharges() {
		return charges;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"ContractEmp [Hours = "+ hr + "Charges = "+ charges + "]";
		
	}
	
	public double CalculateSal() {
		return hr *charges;
	}

}
