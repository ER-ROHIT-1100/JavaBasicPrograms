package com;

import java.util.Scanner;

public class ArrayHappyN {
	
	  public static void main(String[] args) {
		  ArrayOperation ao = new ArrayOperation();
		  int[] x = ao.readArray();	 
;	//		Scanner sc = new Scanner(System.in);
	//		System.out.println("Enter the  Size of Array: ");
	//		int n = sc.nextInt();
	//		int[] x = new int[n];
	//		System.out.println("Enter the "+n+" values");
	//		for(int i=0; i<x.length; i++) {
	//			x[i]=sc.nextInt();
	//		}
			int count = 0;
			for(int i=0; i<x.length; i++) {
				boolean rs = isHappyNumber(x[i]);
				if (rs==true)
					count++;
			}
			System.out.println("Number of Happy Number: "+count);
	  }
	  	static boolean isHappyNumber(int n) {
		while(n>9) {
		int sum=0;
			do {
				int d= n%10;
				sum=sum+d*d;
			n=n/10;
		}while(n!=0);
			 n=sum;
	}
		return n==1||n==7;
 }
}