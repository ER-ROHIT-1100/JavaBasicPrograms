package com;
import java.util.Scanner;
public class ArrayFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number:");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
        }
		
	}
     static  void printFrequency(int[] x) {
         int big = x[0];
         for(int i=1; i<x.length;i++) {
        	 if(x[i]>big)
        		 big=x[i];
         }
         int[]count = new int[big+1];
         for(int i=0;i<x.length;i++) {
        	 count[x[i]]++;
         }
         for(int i=0; i<x.length;i++) {
        	 if(count[i]!=0)
         System.out.println(i+"--"+count[i]);
        }
	  }
	}
