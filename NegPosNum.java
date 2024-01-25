package com;

import java.util.Scanner;

class NegPosNum {

	public static void main(String[] args) {
		ArrayOperation ao = new ArrayOperation();
		int [] x = ao.readArray();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the  Size of Array: ");
//		int n = sc.nextInt();
//		int[] x = new int[n];
//		System.out.println("Enter the "+n+" values");
//		for(int i=0; i<x.length; i++) {
//			x[i]=sc.nextInt();
//		}
       int posnum=0,negnum=0;
       for(int i=0;i<x.length; i++) {
    	   boolean rs= getposnum(x[i]);
    	   if(rs==true)
    		   posnum++;
    	   else
    		   negnum++;
       }
       System.out.println("Positive count is: "+posnum);
       System.out.println("Negative count is: "+negnum);
	}

	static boolean getposnum(int i) {
	     if(i<=0)
		return false;
	
     return true;
  }
}
