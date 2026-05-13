package com.demo.service;

import java.util.Scanner;
import com.demo.model.ContractEmp;
import com.demo.model.SalariedEmp;
import com.demo.model.Employee;

public class EmployeeService {
	
	static Employee[] emparr;
	static int count;
	static {
		emparr=new Employee[100];
  	    emparr[0]=new SalariedEmp(12,"xxxx","4444","hr","mgr",45678);
  	    emparr[1]=new ContractEmp(13,"yyyyy","55555","hr","mgr",67,4568);
  	    count=2;
	}
	public static boolean addNewEmployee(int ch) {
		
		Scanner sc = new Scanner(System.in);
		if(count < emparr.length) {
			System.out.println("Enter Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String nm = sc.next();
			System.out.println("Enter Mobile NUmber : ");
			String mob = sc.next();
			System.out.println("Enter Dept :");
			String dept = sc.next();
			System.out.println("Enter Desg :");
			String desg = sc.next();
			if(ch == 1) {
				System.out.println("Enter Salary :");
				double sal = sc.nextDouble();
				emparr[count] = new SalariedEmp(id,nm,mob,dept,desg,sal);
			} else if(ch == 2) {
				System.out.println("Enter Hours: ");
				float hr = sc.nextFloat();
				System.out.println("Enter Charges :");
				double charges = sc.nextDouble();
				emparr[count] = new ContractEmp(id,nm,mob,dept,desg,hr,charges);
			} else if(ch == 3) {
				//vendor code 
			}
			count ++;
			return true;
			 
		}
		return false;
	}
	public static Employee findById(int id) {
		int pos = searchById(id);
		if(pos != -1) {
			return emparr[pos];
		}
		
		return null;
	}
	private static int searchById(int id) {
		for (int i = 0; i < count ; i++ ) {
			if(emparr[i].getId() == id) {
				return i;
			}
		}
		return 0;
	}
	public static Employee[] getAll() {
		
		return emparr;
	}
	public static Employee[] findByName(String nm) {
		Employee[] arr = new Employee[count];
		int cnt = 0;
		
		for(int i = 0; i < count ; i++) {
			if(emparr[i].getName().equals(nm));
			arr[cnt] = emparr[i];
			cnt++;
		}
		if(cnt > 0) {
			return arr;
		}
		return null;
	}
	
	
	
	
	

}
