package com;

import java.util.Scanner;

class DiseriumFN {
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        for(int i=1;n>0;i++) {
        boolean rs = isDiseriumNumber(i);
        if (rs==true)
        System.out.println(i);
          n--;
        }
                   
	}

	 static int pow(int n, int p) {
		 int prod=1;
		 while(p>0)
		 {
			 prod=prod*n;
			 p--;
		 }
		
		return prod;
	}
      static int countDigit(int num) {
    	int count =0;
    	{
    		do {
    			count++;
    			num=num/10;
    			}while(num!=0);
    		    return count;
    	}
    }
      static boolean isDiseriumNumber(int n) {
  		int sum=0; int temp=n; int dc=countDigit(n);
  		do{
  			int d=n%10;
  			sum=sum+pow(d,dc);
  			dc--;
  			n=n/10;
  		}while(n!=0);
  		return sum==temp;
}
}
		

