package com.cg.java;

import java.util.*;

public class LC {
	
	//for printting the fibonacci number
	private static int fibonacci(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2 || n==3) {
			return 1;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	// for printing the fibonacci series
	static int n1 = 0;
	static int n2 = 1;
	static int f = 0;
	public static void fibonacciSeries(int n) {
		if(n>0) {
			System.out.print(f+" ");
			f = n1 + n2;
			n2=n1;
			n1=f;
			
			fibonacciSeries(n-1);
		}
	}
	
	public static void main(String[] args) {
		//fn = f(n-1) + f(n-2);
		
		// 1 1 2 3 5 8 13 21 ............
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want to print the fibonacci series till that.");
		int n = sc.nextInt();
		
		//----------------------------------------------------------with the help of recursion----------------------------
		System.out.println("the value is:- "+fibonacci(n));
		System.out.println("The fibonacci Series is:-- ");
		fibonacciSeries(n);
		
		
		
		//------------------------------------------------------------Without Recursion------------------------------------
		//printing the fibonacci series till the given n number
		int n1=0, n2=1;
		int f=0;
		boolean b = true;
		if(n==1) {
			System.out.println(n1);
			b = false;
		}
		else if(n==2) {
			System.out.println(n1+" "+n2);
			b = false;
		}
		
		
		if(b) {	
			System.out.println();
			System.out.println("The fibonacci Series is:-- ");
			System.out.print(n1+" "+n2);	
			for(int i=2; i<n; i++) {
				f = n1 + n2;
				System.out.print(" "+f);
				n1=n2;
				n2=f;
			}
		}
		
		//---------------------------------------
		//print the fibonacci number from the series 
		n1=0; n2=1; f=0;
		if(n==1) {
			System.out.print(n1);
			b=false;
		}
		else if(n==2) {
			System.out.print(n1+" "+n2);
			b=false;
		}
		
		if(b) {
			for(int i=2; i<n; i++) {
				f=n1+n2;
				n1=n2;
				n2=f;
			}
			System.out.println();
			System.out.println("the value is: "+f);
		}
		
	}
}
