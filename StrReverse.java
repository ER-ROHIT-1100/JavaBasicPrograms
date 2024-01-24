package com;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		st=reverseStr(st);
		System.out.println(st);
		
	
	}

  	static String reverseStr(String str) {       //
		String rev="";                           // String rev="";
		for(int i=str.length()-1;i>=0;i--) {     // for(int i=0; i<str.length;i++)
			rev=rev+str.charAt(i);               // {
		}                                        //  rev=str.charAt(i)+rev;
		return rev;                              //  }
	}                                            //  return rev;
}

/* Using temp method;Or Swap Array.
{
  char[] ch = str.tocharArray();
  int f =0, l=str.length()-1;
  while(f<l){
    char temp = ch([f]);
     ch[f] = ch[l];
     ch[l] = temp;
     f++;
     l--;
}
str = new String(ch);
 return str;

*/