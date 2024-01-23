package com;

import java.util.Scanner;

class DecHexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		String st = hexaToBinary(n);
	
		System.out.println("The number is Hexadecimal: " +st);

	}

	 static String hexaToBinary(int dec) {
		String hx="";
		do {
			int r=dec%16;
			if(r<10)
			hx=r+hx;
			else
			hx=(char)(r+55)+hx;
		//	else if(r==10)
		//	hx='A'+hx;
		//	else if(r==11)
		//	hx='B'+hx;	
		//	else if(r==12)
		//	hx='C'+hx;
		//	else if(r==13)
		//	hx='D'+hx;
		//	else if(r==14)
		//	hx='E'+hx;	
		//	else if(r==15)
		//	hx='F'+hx;
			dec=dec/16;
		}while(dec!=0);
		return hx;
	}

}
