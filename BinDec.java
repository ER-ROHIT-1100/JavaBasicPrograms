package com;

import java.util.Scanner;

class BinDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int st = binToDecimal(n);
	
		System.out.println("The number is Decimal: " +st);

	}

	 static int binToDecimal(int bin) {
		int dec=0; int p=1;
		do {
			int r=bin%10;
			dec= dec+r*p;
			p=p*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

}
