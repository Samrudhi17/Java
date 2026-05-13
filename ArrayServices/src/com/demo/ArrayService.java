package com.demo;
import java.util.Scanner;

public class ArrayService {

	 
		
	    public static void acceptData(int[] arr) {
	    	Scanner sc=new Scanner(System.in);
	    	
	    		 for(int i=0;i<arr.length;i++) {
	    				System.out.println("enter number "+i);
	    				arr[i]=sc.nextInt();
	    			}
	    }
	    
	   
	    public static void displayData(int[] a) {
	    	
	    			for(int i=0;i<a.length;i++) {
	    				System.out.print(a[i]+"\t");
	    			}
	    	
	    	
	    }
	    
	   
	    public static int searchData(int[] a,int num) {
	    	for(int i=0;i<a.length;i++) {
	    		if(num==a[i]) {
	    			return i;
	    		}
	    	}
	    	return -1;
	    }
	    
	   
	    public static int findSum(int[] a) {
	    	int sum=0;
	    	for(int i=0;i<a.length;i++) {
	    		sum+=a[i];
	    	}
	    	return sum;
	    }
	    
	   
	    public static int findMax(int[] a ) {
	    	int max=a[0];
	    	for(int i=1;i<a.length;i++) {
	    		if(a[i]>max) {
	    			max=a[i];
	    		}
	    	}
	    	return max;
	    }
	
	    public static int findMin(int[] a ) {
	    	int min=a[0];
	    	for(int i=1;i<a.length;i++) {
	    		if(a[i]<min) {
	    			min=a[i];
	    		}
	    	}
	    	return min;
	    }
	    
	   
	  private static int getDigitAddition(int num) {
		      int addition=0;
		      while(num>0) {
				      int d=num%10;        
				       num=num/10;     
				      addition+=d;
		      }
		      return addition;
	  }
	  
		public static int[] findDigitSums(int[] b) {
			int[] arr=new int[b.length];
			for(int i=0;i<b.length;i++) {
				arr[i]=getDigitAddition(b[i]);
			}
			return arr;

	}

}
