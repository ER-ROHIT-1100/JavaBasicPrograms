package com;

import java.util.Scanner;

class ArrayEachFrequency {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Size:");
			int n = sc.nextInt();
			System.out.println("Enter the Array Element:");
			int[] ar = new int[n];
			for(int i=0; i<ar.length;i++) {
				ar[i]=sc.nextInt();
			}
			printFrequency(ar);
	}

	 static void printFrequency(int[] ar) {
	 boolean rs[]= new boolean[ar.length];
	 for(int i=0; i<ar.length;i++) {
		 int count =1;
		 if(rs[i]==false) {
			 for(int j=i+1; j<ar.length;j++) {
				 if(ar[i]==ar[j]) {
					 count++;
					 rs[j]=true;
				 }
			 }
			 System.out.println(ar[i]+" "+count);
		 }
	 }
		
	}

}
