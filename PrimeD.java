package looping;

import java.util.Scanner;

class PrimeD {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		 int n = sc.nextInt();
		 int count=0;
		while(n!=0)  {
			int d= n%10;
			if(d==2||d==3||d==5||d==7)
			 count++;
			 n=n/10;
		 }
		  {
			 System.out.println("Prime:"+count);
		
		 }
       }
      }

	


