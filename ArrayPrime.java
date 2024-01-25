package com;

import java.util.Scanner;

class ArrayPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number:");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
        }{
        	int count=0;
        for(int i=0; i<x.length; i++) {
        	boolean rs=isPrimeNum(x[i]);
        	if(rs==true)
        	count++;
	
	}
		System.out.print(count);
   }
 }
 static boolean isPrimeNum(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) 
		return false;
		}	
  return true;
  }
}