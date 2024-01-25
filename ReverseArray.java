package com;

import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		int[] x = ao.readArray();
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the  Size of Array: ");
	//	int n = sc.nextInt();
	//	int[] x = new int[n];
	//	System.out.println("Enter the "+n+" values");
	//	for(int i=0;i<x.length; i++) {
	//		x[i]=sc.nextInt();
	//	}
       for(int i=x.length-1; i>=0; i--) {
    	   int rs = reverseArray(x[i]);
    	   System.out.println(rs);
       }
	}

	 static int reverseArray(int n) {
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		return rev;
	}
}
