package com;

import java.util.Scanner;

class AllPerfectN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int count=0;
		for(int i=1; i<=n; i++) {
		boolean rs = isPerfectNumber(i);
		if(rs==true)
		count++;
	  }
		System.out.println("The Number is Perfect:" +count);
	}
         static boolean isPerfectNumber(int n) {
		  int sum=0; 
		  for(int i=1; i<=n/2; i++) {
			  if(n%i==0) {
				sum= sum+i;
			  }
		  }
		return sum==n;
	}

}
