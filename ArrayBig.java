package com;

import java.util.Scanner;

class ArrayBig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number:");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
        }
		int big=0;
		for(int i=0; i<x.length; i++) {
			if(x[i]>big)
				big=x[i];	
		}
      System.out.println("Biggest number in Array : "+big);
	}

}
