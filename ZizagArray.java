package com;

class ZizagArray {

	public static void main(String[] args) {
		int[] ar= {23,56,78,89,34};
		int[] br= {11,22,33};
		ArrayOperation ao= new ArrayOperation();
		int[]cr =ao.zigZag(ar,br);
		ao.displayArray(cr);

	}

}
