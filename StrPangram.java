package com;

import java.util.Scanner;

public class StrPangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		boolean rs= isPangram(st);
		if(rs==true)
			System.out.println("String is Pangram");
		else
			System.out.println("String is not Pangram");
		}
     static boolean isPangram(String str) {
		if(str.length()<26)
		return false;
		int[] count = new int[26];
		for(int i=0; i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
	}
		for (int i=0; i<26; i++) {
			if(count[i]==0)
				return false;
		}
    return true;
	}
}

