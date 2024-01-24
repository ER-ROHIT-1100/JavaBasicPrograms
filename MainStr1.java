package com;
import java.util.Scanner;
public class MainStr1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String st = sc.nextLine();
	int uc=0,lc=0,dc=0,spc=0;
	for(int i=0;i<st.length(); i++) {
		char ch = st.charAt(i);
		if(ch>='A'&&ch<='Z')
			uc++;
		else if(ch>='a'&&ch<='z')
			lc++;
		else if(ch>='0'&& ch<='9')
			dc++;
		else
			spc++;
	}
	System.out.println(uc);
	System.out.println(lc);
	System.out.println(dc);
	System.out.println(spc);
 }
}
