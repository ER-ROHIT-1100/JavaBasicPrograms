package com;

import java.util.Scanner;

public class StrAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings:");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean rs = isAnagram(s1,s2);
		if(rs==true)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
	}
	 static boolean isAnagram(String s1, String s2) {
		int[] c1 = countFrequency(s1);
		int[] c2 = countFrequency(s2);
		for(int i=0; i<26;i++) {
			if(c1[i]!=c2[i])
			return false;
		}
		return true;
	}
	 static int[] countFrequency(String str) {
		int[] count = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(ch>='A'&& ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&& ch<='z')
				count[ch-97]++;
		}
		return count;
	}
	

}
