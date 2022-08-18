package com.cg.Recursion;

import java.util.Arrays;

public class RemoveDulpicatesString {

	public static boolean[] arr = new boolean[26];
	
	public static void removeDuplicates(String str, int idx, String ans) {
		if(idx == str.length()) {
			System.out.println(ans);
			return ;
		}
		System.out.println(Arrays.toString(arr));
		char currChar = str.charAt(idx);
		if(arr[currChar - 'a']) {
			removeDuplicates(str, idx+1, ans);
		}
		else {
			ans += currChar;
			arr[currChar - 'a'] = true;
			removeDuplicates(str, idx+1, ans);
			
		}
	}
	public static void main(String[] args) {
		String str = "abbccda";
		removeDuplicates(str, 0, "");
	}

}

//time complexity = O(n)
