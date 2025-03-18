package com.dhakshu;

public class Pattern {
	public static void main(String args[]) {
		
		int r=5;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		int alpha=65;
		int row=5;
		for(int m=1;m<=row;m++) {
			for(int c=1;c<=m;c++) {
				System.out.print((char)(alpha+m+1)+" ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
