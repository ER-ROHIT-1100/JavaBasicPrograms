package com;

class ArrayDeleteIndex {

	public static void main(String[] args) {
		   ArrayOperation ao = new ArrayOperation();
		   int[] ar = {23,28,45,56,58,32};
		      ar = ao.deleteArray(ar,2);
		    System.out.println("After Delete: ");
		    ao.displayArray(ar);

		}

	}


