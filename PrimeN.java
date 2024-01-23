package com;
import java.util.Scanner;
class PrimeN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		 int n = sc.nextInt();
		 int count=0;
		 for(int i=2; i<=n; i++) {
			 boolean rs = isPrime(i);
			 if(rs==true)
				 count++;
		 }
		 System.out.println("The prime Number is:" +count);
  }

	static boolean isPrime(int x) {
		for(int i=2; i<=x/2; i++) {
			if(x%i==0)
			return false;
		}
	return true;
  }
}