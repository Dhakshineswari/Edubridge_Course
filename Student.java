package com.dhakshu;
import java.util.Scanner;
public class Student {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online
	    public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
	       System.out.print("Enter Student name:");
	       String name=sc.nextLine();
	       System.out.print("Enter Student age:");
	       int age=sc.nextInt();
	       System.out.print("Enter grade for Maths:");
	       int m1=sc.nextInt();
	       System.out.print("Enter grade for Science:");
	       int m2=sc.nextInt();
	       System.out.print("Enter grade for English:");
	       int m3=sc.nextInt();
	       
	       float avg=(m1+m2+m3)/3;
	       System.out.println("Average:"+avg);
	       if(avg>=75){
	           System.out.println("First Class");
	       }
	       else if(avg<75 && avg>=60){
	           System.out.println("Second Class");
	       }
	       else if(avg<60 && avg>=50){
	           System.out.println("Third Class");
	       }
	       else{
	           System.out.println("Fail ");
	       }
	    }
	}

