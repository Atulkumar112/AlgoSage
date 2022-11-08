package com.cg.java;
//finding the sum of natural numbers
public class TimeComplexity {
	public static void main(String[] args) {
		double now  = System.currentTimeMillis();  // it is storing the current now on this stage
		System.out.println(findSum(99999));
		
		// mesure the time that how much time taken by my code till now 
		
		
		System.out.println("Time taken "+ (System.currentTimeMillis()-now) + " miliSecond");
//										 (this is the current time - previous time )
	}
	
	
	// TC = O(1)
//	public static int findSum(int n) {
//		return n*(n+1)/2;
//	}
	
	// TC = O(n) where n is the that number where we need to do the sum of the natural num (only here means n = 99999)
	public static int findSum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
