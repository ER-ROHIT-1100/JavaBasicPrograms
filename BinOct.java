package com;

import java.util.Scanner;

class BinOct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int st = octToDecimal(n);
	
		System.out.println("The number is Decimal: " +st);
}
      static int octToDecimal(int oct) {
		int dec=0; int p=1;
		do {
			int r=oct%10;
			dec= dec+r*p;
			p=p*8;
			oct=oct/10;
		}while(oct!=0);
		return dec;
	}	
}
