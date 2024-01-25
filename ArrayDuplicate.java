package com;

import java.util.Scanner;

class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the Elements");
		for(int i=0; i<ar.length;i++) {
			ar[i]=sc.nextInt();		}
		int[] rs = removeDuplicateNum(ar);
		for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i]);	
		}


	}
	static int[] removeDuplicateNum(int[] y) {
		boolean rs[] = new boolean[y.length];
		int count=0;
		for(int i=0; i<y.length; i++) 
		{
			if(rs[i] ==false)
			{
				for(int j=i+1;j<y.length;j++) {
					if(y[i]==y[j])
					{
						count++;
						rs[i]=true;
					}
				}
			}		
		}
		int[] x = new int[y.length-count];
		int k=0;
		for(int i=0;i<y.length;i++) {
			if(rs[i]==false)
				x[k++]=y[i];
		}
		return x;		 
	}
}





