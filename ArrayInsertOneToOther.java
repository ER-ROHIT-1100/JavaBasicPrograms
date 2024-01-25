package com;

public class ArrayInsertOneToOther {

	public static void main(String[] args) {
		   ArrayOperation ao = new ArrayOperation();
		   int[] ar = {23,28,45,56,58,32};
		   int[] br = {24,26,47,54,34};
		      ar = ao.insertArray(ar,br,1);
		    System.out.println("After insert: ");
		    ao.displayArray(ar);

		}

	}


