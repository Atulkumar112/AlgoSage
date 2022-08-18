package com.cg.Recursion;

//very important of subsequences 
public class SubsequencesOfString {

	public static void getSubsequences(String str, int idx, String newStr) {
		
		if(idx == str.length()) {
			System.out.println(newStr);
			return ;
		}
		char currChar = str.charAt(idx);
		// to be
		getSubsequences(str, idx+1, newStr+currChar);
		
		//not to be
		getSubsequences(str, idx+1, newStr);
	}
	public static void main(String[] args) {
		String str = "abc";
		getSubsequences(str, 0, "");
	}

}

//time comlexity is O(2^n)
// Geometric Progression = a(r^n+1 -1)/(r-1) => a = 1, r = 2 
// 1(2^n+1 - 1)/(2-1) = O(2^n) 
