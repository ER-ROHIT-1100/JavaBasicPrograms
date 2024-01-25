package com;

import java.util.Scanner;

public class ArraySumOfPairElement {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		System.out.println("Enter the Array Element:");
		int[] ar = new int[n];
		for(int i=0; i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		printPairSumOfElement(ar,n);

	}

     	 static void printPairSumOfElement(int[] ar, int n) {
         for(int i=0; i<ar.length; i++) {
        	 {
        	 for(int j=i+1;j<ar.length; j++) {
        		if(ar[i]+ar[j]==n) {
        			System.out.println(ar[i]+" "+ar[j]);
        		}
        		 }
        	 }
         }	
	}
}
