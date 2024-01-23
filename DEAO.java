package looping;

import java.util.Scanner;

class DEAO {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value:");
			int n = sc.nextInt();
			 int ecount=0; int ocount=0;
			do{
				int d = n%10;
				if(d%2==0) {
	               
	                  ecount++;
				}else {
						
						ocount++;
				}
				n=n/10;
				}while(n!=0);
				System.out.println("Number of Even digit:"+ecount);
				System.out.println("Number of Odd digit:"+ocount);
			}
	}


