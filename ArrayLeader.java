package com;

import java.util.Scanner;

public class ArrayLeader {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Size:");
			int n = sc.nextInt();
			System.out.println("Enter the Array Element:");
			int[] ar = new int[n];
			for(int i=0; i<ar.length;i++) {
				ar[i]=sc.nextInt();
			}
			printArrayLeader(ar);
	}

	static void printArrayLeader(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			boolean rs = true;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					rs=false;
					break;
					}
				}
			if(rs==true)
				System.out.println(ar[i]+" ");
		}
		
	}
 }
	
