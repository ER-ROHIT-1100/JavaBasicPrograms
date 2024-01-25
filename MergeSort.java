package com;
import java.util.Arrays;
public class MergeSort {


	public static void main(String[] args) {
		int[] ar= {23,56,78,89,};
		int[] br= {11,22,33,78};
		ArrayOperation ao = new ArrayOperation();	
		int[]  z= ao.mergeSort(ar,br);

		ao.displayArray(z);
	}
}
