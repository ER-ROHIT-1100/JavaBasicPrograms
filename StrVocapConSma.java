package com;

import java.util.Scanner;

public class StrVocapConSma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		st = convertVcCs(st);
        System.out.println(st);
	}

	 static String convertVcCs(String str) 
	 {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z') {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				ch[i]=(char)(ch[i]-32);
		}
		else if(ch[i]>='A' && ch[i]<='Z')
		{
			if((ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'==false))
			ch[i]=(char)(ch[i]+32);
	}
  }
	 str=new String(ch);
	 return str;
	
  }
}
