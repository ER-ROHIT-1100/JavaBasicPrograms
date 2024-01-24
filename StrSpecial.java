package com;

import java.util.Scanner;

public class StrSpecial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		int spc = countSpecial(st);
		System.out.println("Nunber of Special Characters: "+spc);
	}

	 static int countSpecial(String str) {
		int count=0;
		{
			for(int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				if((ch>='A' && ch<='Z'|| ch>='a' && ch<='z'||ch>='0' && ch<='9')==false)
				count++;
			}
		}
		return count;
	}

}
