package com;

import java.util.Scanner;

class PrimeMN {
    public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number:");
			 int m= sc.nextInt();
			 int n=sc.nextInt();
			 for(int i=m; i<=n; i++) {
				 boolean rs = isPrime(i);
				 if(rs==true)
	   		 System.out.println(i);

	}

}

	 static boolean isPrime(int x) {
		for (int i=2; i<=x/2; i++) {
		if(x%i==0)	
		return false;
	}
		return true;
 }
}