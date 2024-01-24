package com;
import java.util.Scanner;
public class MaintStr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();  
		int sum = 0;
		for(int i=0; i<st.length();i++){
			char ch = st.charAt(i);
			if(ch>='0'&&ch<='9')
			sum=sum+ch-48; 
		
			
		}
			System.out.println(sum);

	}

}
