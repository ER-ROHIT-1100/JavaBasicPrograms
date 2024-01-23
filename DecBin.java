package com;

import java.util.Scanner;

class DecBin {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		String st = decToBinary(n);
	
		System.out.println("The number is Binary: " +st);

	}

	 static String decToBinary(int dec) {
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec= dec/2;
			}while(dec!=0);
		return bin;
	}

}
