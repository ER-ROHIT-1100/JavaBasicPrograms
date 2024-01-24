package com;

import java.util.Scanner;

public class StrContWord {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		int wc = countWord(st);
		System.out.println("Nunber of Words Are: "+wc);
	}

	 static int countWord(String str) {
		int wc = 0;
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(i==0 && ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ')
				wc++;
		}
		return wc;
	}
}
