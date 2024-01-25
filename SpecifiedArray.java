package com;
import java.util.Scanner;
class SpecifiedArray {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
       ArrayOperation ao = new ArrayOperation();	
		int[] z = ao.readArray();
		System.out.println("User Entered Array Element:");
          ao.displayArray(z);
		System.out.println(" Enter the Element to Search:");
        int ele= sc.nextInt();
        int in = ao.specifiedNumber(z, ele);
        
	if(in!=-1)
		System.out.println(ele+" present at index"+in);
	else
		System.out.println(ele+" Not present");
	}  
}
