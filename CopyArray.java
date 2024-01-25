package com;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Size of Array: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
		}
		int[] b = new int[n];
		System.out.println("Copy of Array is: ");
		for(int i=0; i<x.length; i++) {
			b[i] = x[i];
			System.out.println(b[i]+" ");
		}
	}
}
