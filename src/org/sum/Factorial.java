package org.sum;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
	    for(int i=1;i<=5;i++)
	    {
	    	 f=f*i;
	    }
	    System.out.println(f);
	}
}
