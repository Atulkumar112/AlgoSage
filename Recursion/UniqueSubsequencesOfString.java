package com.cg.Recursion;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubsequences {
	public static void uniqueSubsequences(String str, Set<String> set, int idx, String currStr) {
		if(idx == str.length()) {
			if(set.contains(currStr)) {
				return ;
			}
			else {
				System.out.println(currStr);
				set.add(currStr);
//				System.out.println(set);
				return ;
			}
		}
		
		uniqueSubsequences(str, set, idx+1, currStr + str.charAt(idx));
		
		uniqueSubsequences(str, set, idx+1, currStr);
		
	}
	
	public static void main(String[] args) {
		String str = "aaa";
		Set<String> set = new HashSet<String>();
		uniqueSubsequences(str, set, 0, "");

	}

}


