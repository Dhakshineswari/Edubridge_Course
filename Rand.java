package com.dhakshu;
import java.util.Scanner;
import java.util.Random;
public class Rand {
	public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	System.out.println("Enter");
	int max=sc.nextInt();
	for(int i=0;i<=10;i++) {
		 System.out.println(rand.nextInt(max));
	}
	
	}
}
