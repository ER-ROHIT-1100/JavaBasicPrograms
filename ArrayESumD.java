package com;

import java.util.Scanner;

class ArrayESumD {

		  public static void main(String[] args) {
			  ArrayOperation ao = new ArrayOperation();
			   int [] x = ao.readArray();
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter the  Size of Array: ");
//				int n = sc.nextInt();
//				int[] x = new int[n];
//				System.out.println("Enter the "+n+" values");
//				for(int i=0; i<x.length; i++) {
//					x[i]=sc.nextInt();
//				}
             System.out.println("Replace sum is: ");
             for(int i=0; i<=x.length; i++) {
            	 int rs= replace(x[i]);
            System.out.println(rs);
             }
	}

		 static int replace(int n) {
		 int sum=0;
		 do {
			 int d=n%10;
			 sum=sum+d;
			 n=n/10;
		 }while(n!=0);
			return sum;
		}

}
