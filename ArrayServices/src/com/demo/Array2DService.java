package com.demo;
import java.util.Scanner;

public class Array2DService {

	
		
		
		public static void acceptData(int[][] arr) {
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter data for row "+i +" and col : "+j);
					arr[i][j]=sc.nextInt();
				}
			}
			
		}

		
		public static void displayData(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			
		}

		
		public static int findMax(int[][] arr) {
			int max=arr[0][0];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]>max) {
						  max=arr[i][j];
					}
				}
			}
			return max;
		}
		
		
		public static int findMin(int[][] arr) {
			int min=arr[0][0];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]<min) {
						  min=arr[i][j];
					}
				}
			}
			return min;
		}

		
			public static int findSum(int[][] arr) {
				int sum=0;
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						sum+=arr[i][j];
					}
				}
				return sum;
			}
		
		
		
		public static int[] findSumRowWise(int[][] arr) {
			
			int[] sum=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					   sum[i]=sum[i]+arr[i][j];
				}
			}
			return sum;
		}

		public static int[] findSumColumnWise(int[][] arr) {
			//array length is same as number of columns
			int[] sumarr=new int[arr[0].length];
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr.length;j++) {
					  sumarr[i]=sumarr[i]+arr[j][i];
				}
			}
			return sumarr;
		}

		public static int[] findRowwiseMaximum(int[][] arr) {
			
					int[] max=new int[arr.length];
					for(int i=0;i<arr.length;i++) {
						
						max[i]=arr[i][0];
						for(int j=0;j<arr[i].length;j++) {
							if(max[i]<arr[i][j])
							   max[i]=arr[i][j];
						}
					}
					return max;
		}

		public static int[] findColumnwiseMaximum(int[][] arr) {
			int[] maxarr=new int[arr[0].length];
			for(int i=0;i<arr[0].length;i++) {
				
				maxarr[i]=arr[0][i];
			
				for(int j=0;j<arr.length;j++) {
					if(maxarr[i]<arr[j][i])
						   maxarr[i]=arr[j][i];
				}
			}
			return maxarr;
		
		
	}

}
