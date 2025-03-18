package com.dhakshu;

public class Sum {
  public static void main(String args[]) {
	  int sum=0;
	  for(int i=101;i<200;i++) {
		  if(i%9==0) {
			  System.out.println(i);
			  sum=sum+i;
		  }
	  }
	  System.out.println("Sum :"+sum);
	  }
}
