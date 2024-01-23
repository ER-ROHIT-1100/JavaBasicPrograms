package com;
       class ArmstrongT {

	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		for(int i=100; i<=999; i++) {
			boolean rs=isArmstrong(i);
			if(rs==true)
				System.out.println(i);
		}

	}

	static boolean isArmstrong(int x) {
		int sum=0; int temp=x;
		for(int i=1; i<=x; i++) 
		do{
			int d=x%10;
			sum=sum+d*d*d;
			x=x/10;
		}while(x!=0);
		if(sum==temp) {
		return true;
	}
       return false;
  }
}