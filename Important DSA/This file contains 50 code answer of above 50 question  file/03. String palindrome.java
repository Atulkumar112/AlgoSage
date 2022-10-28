package com.cg.java;

import java.util.*;

public class LC {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans ="";
		for(int i=s.length()-1; i>=0; i--) {
			ans+= s.charAt(i);
		}
		
		System.out.println(ans);
		
		if(s.equals(ans)) {
			System.out.println("It is a palindrom string");
		}
		else {
			System.out.println("It isn't");
		}
	}
}
