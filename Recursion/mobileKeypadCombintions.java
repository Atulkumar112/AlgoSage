package com.cg.Recursion;

public class MobileKeypadCombination {

	public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void keypadCombination(String str, int idx, String combination) {
		if(idx == str.length()) {
			System.out.println(combination);
			return ;
		}
		char currChar = str.charAt(idx);
		String running  = keypad[currChar - '0'];
		
		for(int i=0; i<running.length(); i++) {
			
			keypadCombination(str, idx+1, combination+running.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = "23";
		keypadCombination(str, 0, "");
	}

}


// time complexity is O(4^n)
