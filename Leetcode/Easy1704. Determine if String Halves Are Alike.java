class Solution {
    public boolean halvesAreAlike(String s) {
        
        // my code given 19ms
        String a = s.substring(0, s.length()/2);
		String b = s.substring(s.length()/2);
        String vowels = "aeiouAEIOU";
		int ans=0;
		
		// List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
				
		for(int i=0; i<a.length(); i++) {
			
			// if(list.contains(a.charAt(i))){
			// 	ans++;
			// }
			// if(list.contains(b.charAt(i))){
			// 	ans--;
			// }
            // i changes below statment insted of above then it got good 
            if(vowels.indexOf(a.charAt(i))>=0) ans++;
            if(vowels.indexOf(b.charAt(i))>=0) ans--;
		}
		return ans==0;
    }
    
    
    //below is best code getting 2ms time 
//     String vowels = "aeiouAEIOU";
    
//     public boolean halvesAreAlike(String S) {
//         int mid = S.length() / 2, ans = 0;
//         for (int i = 0, j = mid; i < mid; i++, j++) {
//             if (vowels.indexOf(S.charAt(i)) >= 0) ans++;
//             if (vowels.indexOf(S.charAt(j)) >= 0) ans--;
//         }
//         return ans == 0;
//     }
}
