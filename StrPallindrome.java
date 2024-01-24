package com;

import java.util.Scanner;

public class StrPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.next();
		boolean rs = isPallindrome(st);
		if(rs==true)
			System.out.println(st+" is a Pallindrome");
		else
			System.out.println(st+" is not Pallindrome");

	}

	 static boolean isPallindrome(String str) {
          int f=0,l=str.length()-1;
          while(f<l) {
        	  if(str.charAt(f)!=str.charAt(l))
        		  return false;
        	  f++;
        	  l--;
          }
		return true;
	}

}
