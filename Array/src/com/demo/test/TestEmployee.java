package com.demo.test;

import com.demo.model.ContractEmp;
import com.demo.model.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		SalariedEmp se = new SalariedEmp(1,"john","5245454354","jgyf","hghfg",65535);
		ContractEmp ce = new ContractEmp(2,"Sam","765645665","jgcy","yfhtf",34,7675);
		
		
		System.out.println(se);
		System.out.println(ce);
		
		
		System.out.println(se.CalculateSal());
		System.out.println(se.CalculateBonus(035f));
		System.out.println(ce.CalculateSal());
		


	}

}
