package com;
import java.util.Scanner;
class PersonWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number:");
		int n = sc.nextInt();
		double[] x = new double[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextDouble();
		}{
			double sum=0 ;
			for(int i=0; i<x.length; i++) {
				sum=sum+x[i]/2;
				
			}
			System.out.println("Avg Weight of Person: "+sum);
			
		}
			

	}

}
