//Swap 2 number without define 3rd variable 
package com.cg.java;

public class GroupDis {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a+b;    // now a = 30
		b = a - b;   // now b = 30 - 20 = 10
		a = a - b;   // now a = 30 - 10 = 20
		// so now a = 20 and b = 10
		System.out.println("a = "+a );
		System.out.println("b = "+ b);
	}
}
