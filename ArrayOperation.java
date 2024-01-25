package com;

import java.util.Scanner;

 public class  ArrayOperation {
	 
 
	     int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Size of Array: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.print("Enter the "+n+" values");
		for(int i=0; i<x.length; i++) {
			x[i]=sc.nextInt();
		}
		 return x;
		 }
	     void displayArray(int[] x) {
	    	 for(int i=0; i<x.length; i++) {
	    		 System.out.print(x[i]);
	    		 
	    	 if(i<x.length-1)
	    		 System.out.print(",");
	    	 }	 
	   	 System.out.println();
	     }
		public int[] merge(int[] ar, int[] br) {
			int[] cr = new int[ar.length+br.length];
			for(int i=0; i<ar.length;i++) {
				cr[i]=ar[i];
			}
			for(int i=0; i<br.length; i++) {
				cr[ar.length+i]=br[i];
			}
				
			return cr;
		}
		public int[] zigZag(int[] ar, int[] br) {
			int i=0, k=0;
		   int[] cr= new int[ar.length+br.length];
		 while(i<ar.length && i<br.length) {
			  cr[k]=ar[i];
			  k++;
			  cr[k]=br[i];
			  i++;
			  k++;
		 }while(i<ar.length) {
			 cr[k]=ar[i];
			 k++;
			 i++;
		 }while(i<br.length) {
			 cr[k]=br[i];
			 k++;
			 i++;
		 }
			return cr;
		}
	public int[] mergeSort(int[] ar, int[] br) {
			
		int i=0,j=0,k=0;
		int z[]= new int[ar.length+br.length];
		while(i<ar.length && j<br.length){
			if(ar[i]<br[j]){
			z[k++]=ar[i++];	    
			}else{
				z[k++]=br[j++];
			}
		}
		while(i<ar.length) {
			z[k++]= ar[i++];
		}while(j<br.length) {
			z[k++]= br[j++];
		}
		return z;
		}
	 int specifiedNumber(int[] z,int ele) {
		for (int i=0; i<=z.length; i++) {
			if(z[i]==ele)
				return i;
		}
		return -1;
	}
	public int getSecondBiggest(int[] ar) {
		int sbig = Integer.MIN_VALUE,fbig=Integer.MIN_VALUE;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]>fbig) {
			 sbig=fbig;
			 fbig=ar[i];
			}else if(ar[i]>sbig && ar[i]!=fbig) {
				sbig = ar[i];
			}
		}
		return sbig;
	}
	public int getNTHBiggest(int[] ar, int n) {
		for(int i=0; i<ar.length; i++) {
			int count=0;
		for(int j=0; j<ar.length; j++) {
			if(ar[j]>ar[i])
				count++;
		}
		if(count==n-1)
			return ar[i];
	}
	return 0;
  }
	public int[] insertArray(int[] x,int ele,int in) {
		if(in<0|| in>x.length) {
			System.out.println("Index not in Range:");
			return x;
		}
		int[]y =new int[x.length+1];
		y[in]=ele;
		for(int i=0; i<x.length;i++)
		{
	    if(i<in)
       y[i]= x[i];
	    else
	    y[i+1]=x[i];
		}
		return y;
	}
	public int[] insertArray(int[] x, int[] y, int in) {
		if(in<0|| in>x.length) {
			System.out.println("Index not in Range:");
			return x;
		}
		int[]z =new int[x.length+y.length];
		for(int i=0; i<y.length;i++)
		{
		z[in+i]=y[i];
		}
		for(int i=0; i<x.length;i++) {
	    if(i<in)
       z[i]= x[i];
	    else
	    z[i+y.length]=x[i];
		}
		return z;	
	}
	public int[] deleteArray(int[] x, int in) {
		if(in<0|| in>x.length) {
			System.out.println("Index not in Range:");
			return x;
		}
		int[]y =new int[x.length-1];
		for(int i=0; i<x.length-1;i++)
		{
	    if(i<in)
       y[i]= x[i];
	    else
	    y[i]=x[i+1];
		}
		return y;
	}
 }
 