package com.cg.java;

import java.util.*;

public class LC {
	public static void main(String[] args) {
		System.out.println("Enter a Integer number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//121 --> 121
		int con=0;
		int temp = n;
		while(n>0){
			int dig = n%10;
			con = (con*10)+dig;
			n = n/10;
		}
		System.out.println(con+" = "+temp);
		if(con == temp) {
			System.out.println("It is a palindrom number");
		}
		else {
			System.out.println("It isn't");
		}
	}
}
