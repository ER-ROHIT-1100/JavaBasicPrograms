package com;

import java.util.Scanner;

class NameRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number: ");
		int n = sc.nextInt();
		String[] x = new String[n];
		System.out.println("Enter the "+n+" Names");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.next();	
		}{
			for(int i=x.length-1;i>=0; i--) {
				System.out.println(x[i]);
			}
				
		}
         
	}

}
