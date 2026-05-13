package com.demo.model;

public class Person {
	
	private int pid;
	private String pname;
	private String mob;
	
	public Person() {
		super();
	}
	
	public Person(int pid, String pname, String mob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
	}

	public String getMob() {
		return mob;
	}
	
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	public String getName() {
		return pname;
	}
	
	public void setName(String pname) {
		this.pname = pname;
	}
	
	public int getId() {
		return pid;
	}
	
	public void setId(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + "]";
	}

	

}
