package com;

public class ArrayInsertSpecified {

	public static void main(String[] args) {
	   ArrayOperation ao = new ArrayOperation();
	   int[] ar = {23,28,45,56,58,32};
	      ar = ao.insertArray(ar,25,1);
	    System.out.println("After insert: ");
	    ao.displayArray(ar);

	}

}
