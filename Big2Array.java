package com;

class Big2Array {

	public static void main(String[] args) {
	//	int[] ar= {23,56,78,89,34};
		ArrayOperation ao= new ArrayOperation();
		    int[] ar = ao.readArray();
             ao.displayArray(ar);   
             int sbig= ao.getSecondBiggest(ar);
            System.out.println("The Second Biggest Number:"+sbig); 
             
	 }     
	}

