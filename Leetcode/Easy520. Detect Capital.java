class Solution {
    public boolean detectCapitalUse(String word) {
        // we can do this same question using ASCI Values upercase have values 65 to 90 and lower case have asci values 97 to 122
        // int u = 0, l=0, n=s.length();
        // for(int i=0; i<n; i++) {
        // 	if(Character.isUpperCase(s.charAt(i))) {
        // 		u++;
        // 	}
        // 	else {
        // 		l++;
        // 	}
        // }
        // System.out.println(l+" "+u);
        
        // if(u==n || l==n) {
        // 	return true;
        // }
        // else if(Character.isUpperCase(s.charAt(0))  && l == n-1) {
        // 	return true;
        // }
        
        // return false;

        // very easy solution from soution section 
        int num_capitals = 0;
        for(int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                num_capitals++;
            }
        }
        return num_capitals == 0 || (num_capitals == 1 && Character.isUpperCase(word.charAt(0))) || num_capitals == word.length();     
    }
}
