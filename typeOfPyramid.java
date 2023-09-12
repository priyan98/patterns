package com.pyramid;

public class typeOfPyramid {
	private static void FullPrymid(int n) {

		for (int i=1; i <=n; i++) {
			for (int j=i ;j<n; j++) {
				System.out.print(" ");
			} 
			for (int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private static void LeftPrymid() {

		int r = 6;
		for(int i = 1; i<=r; i++) {
		 for(int j = 1; j<=i ; j++) {
			 System.out.print("*");
		 }	
		 System.out.println("");
		}
	}
	private static void RightPrymid(int n) {

		for (int i=1; i<=n; i++) {
			for (int j=i ;j<n; j++) {
				System.out.print(" ");
			} 
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private static void g(int n) {

		int row=1,column=1;
		
		do{
		int x=4;
		 do{
		System.out.print("");
		x--;
		}while(x>=row);
		column=1;
		do{
		System.out.print("*"+" ");
		column++;
		}while(column<=row);
		System.out.println(" ");
		row++;
		}while (row<=5);
		}

	public static void main(String[] args) {
		//g(4);
		RightPrymid(5);
		LeftPrymid();
		
	}
}
