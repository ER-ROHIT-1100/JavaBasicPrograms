package com;

import java.util.Scanner;

class ArrayFrequency {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] ar = new int[n];
		for(int i=0; i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		countElement(ar);
	}
	static void countElement(int ar[]) {
		int big =ar[0];
		for(int i=0; i<ar.length; i++) {
			if(big<ar[i])
				big=ar[i];
		}
		int c[]= new int[big+1];
			for(int i=0;i<ar.length;i++) {
					c[ar[i]]++;
					}
			for(int i=0; i<c.length; i++) {
				if(c[i]>0)
				System.out.println(i+" "+c[i]);
			}
	   }
	}
	


