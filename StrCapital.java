package com;

import java.util.Scanner;

public class StrCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.next();
		st = toCapital(st);
		System.out.println(st);

	}

	 static String toCapital(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		str=new String(ch);
		return str;
	}

}
