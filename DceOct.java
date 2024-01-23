package com;

import java.util.Scanner;

class DceOct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		String st = octToBinary(n);
	
		System.out.println("The number is Octadecimal: " +st);

	}

	 static String octToBinary(int dec) {
	    String oct="";
	    do {
	    	int r =dec%8;
	    	oct=r+oct;
	    	dec= dec/8;
	    }while(dec!=0);
		return oct;
	}

}
