// Add two number without using any arithmatic oparator
package com.cg.java;

public class GroupDis {

	public static void main(String[] args) {
		int a=10;
		int b=43;
		
		//iterative approach
		while(b!=0) {
			int carry = (a & b) ; //CARRY is AND of two bits
	          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum	
		}
		System.out.println(a);
		
		System.out.println(add(a, b));
	}
	
	//recursively approach
	private static int add(int a, int b) {
		if(b==0) {
			return a;
		}
		int carry = a & b;
		a = a^b;
		b = carry << 1;
		return add(a, b);
	}
}
