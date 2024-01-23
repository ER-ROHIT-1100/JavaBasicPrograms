package com;
import java.util.Scanner;
class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n= sc.nextInt();
	    boolean str= isStrongNumber(n);
		if(str==true)
			System.out.println("Is Strong Number:"+n);
		else
			System.out.println("Is not Strong Number:"+n);
	}

	 static boolean isStrongNumber(int n) {
		int sum=0; int temp=n;
		do {
			int d= n%10;
			sum=sum+fact(d);
			n=n/10;
			}while(n!=0);
		  if (temp==sum) {
			  return true;
		  }else
	         return false;
	}

      static int fact(int n) {
    	  int fact =1;
    	  while(n>1) {
    	   fact=fact*n;
    	   n--;
    	  }
    	  
		return fact;
	}

}
