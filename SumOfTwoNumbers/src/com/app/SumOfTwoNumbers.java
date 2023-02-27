package com.app;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("SumOfTwoNumbers");
		System.out.println();
		System.out.println("Enter Num1");
		
	    int num1= sc.nextInt();
	    System.out.println("Enter Num2");
	    int num2= sc.nextInt();
	    int sum=num1+num2;
	    System.out.println("Sum of Numbers: "+sum);
	}

}
