package org.sum;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		while(n>0)
		{
			int i=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println(sum);
	}

}
