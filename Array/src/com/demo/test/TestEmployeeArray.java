package com.demo.test;

import java.util.Scanner; 
import com.demo.service.EmployeeService;
import com.demo.model.Employee;

public class TestEmployeeArray {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. add new employee \n 2. delete employee \n 3. search employee by id \n4. update employee salary");
			System.out.println("5. display All \n 6. display by name \n 7. calculate net salary \n 8. exit\n choice: ");
			
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 -> {
				System.out.println("1. SalariedEmp\n 2. ContractEmp\n 3. Vendor ");
				int ch = sc.nextInt();
				
				boolean status = EmployeeService.addNewEmployee(ch); 
				
				if(status) {
					System.out.println("Employee Added Successfully!");
				} else {
					System.out.println("Employee Not Added.");
				}
			}
			
			case 2 ->{
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				
				
				
				
			}
			
			case 3 ->{
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				Employee e = EmployeeService.findById(id);
				if(e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not Found.");
				}
			}
			
			case 4 -> {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				System.out.println();
			
				
			}
			
			case 5 ->{
				Employee[] emparr = EmployeeService.getAll();
				for(Employee e : emparr) {
					if(e != null) {
						System.out.println(e);
					}
					else {
						break;
					}
				}
			}
			
			case 6 ->{
				System.out.println("Enter Name :");
				String nm = sc.next();
			    Employee[] arr = EmployeeService.findByName(nm);
			    if(arr != null) {
			    	for(Employee e : arr) {
			    		if(e != null) {
			    			System.out.println(e);
			    		} else {
			    			break;
			    		}
			    	}
			    }
			    System.out.println("Name Not Found");
			}
			
			case 7 ->{
				
			}
			
			}
			
			
			
			
		} while(choice != 8);
		

	}

}
