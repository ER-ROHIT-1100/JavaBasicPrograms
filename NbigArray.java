package com;
import java.util.Scanner;
class NbigArray {

	public static void main(String[] args) {
	   	 Scanner sc = new Scanner(System.in);
		 ArrayOperation ao= new ArrayOperation();
	     int[] ar = ao.readArray();
         ao.displayArray(ar);   
         int big= ao.getNTHBiggest(ar,4);
        System.out.println("The Nth Biggest Number:"+big); 
	}

}
