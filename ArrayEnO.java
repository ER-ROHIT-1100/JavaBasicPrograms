package com;

import java.util.Scanner;

class ArrayEnO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number:");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
        }
		//int es=0, os=0;
		int[] count={0,0};
		for(int i=0; i<x.length; i++) {
		count[x[i]%2]++;
			
		}
       System.out.println(count[0]);
       System.out.println(count[1]);
	}

}
