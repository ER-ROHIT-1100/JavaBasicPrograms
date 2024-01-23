package com;
//import java.util.Scanner;
class Prime100 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		// int n = sc.nextInt();
		for (int x=2; x<=100; x++) {
			boolean rs = isPrime(x);
			if (rs==true)
				System.out.println(x);
					
		}
	}

	static boolean isPrime(int x) {
		for (int i=2; i<=x/2; i++) {
			if (x%i==0)
				return false;
		}
		return true;
	}
	}
