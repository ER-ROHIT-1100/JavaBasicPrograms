package com;
import java.util.Scanner;
class PrimeSum{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		 int n = sc.nextInt();
		 int sum=0;
		 for(int i=2; i<=n; i++) {
			 boolean rs = isPrime(i);
			 if(rs==true)
			 sum=sum+i;
		 }
		 System.out.println("The prime NUmber is:" +sum);
  }

	static boolean isPrime(int x) {
		for(int i=2; i<=x/2; i++) {
			if(x%i==0)
			return false;
		}
	return true;
  }
}
