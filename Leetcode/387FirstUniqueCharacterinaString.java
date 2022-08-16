class Solution {
    public int firstUniqChar(String s) {
//  12 ms runtime this is the best solution ...
        int freq [] = new int[26];
      //this loop updating the value at a character position
        for(int i = 0; i < s.length(); i ++){
            freq [s.charAt(i) - 'a'] ++;
          //here let suppose s = loveleetcode the s.charAt(i) = l and then we subtract 'l' - 'a' then we got the 11 because l is on 12 position and a is 1 position so
          // 12 - 1 = 11 then at the the 11 index we updated our array by one number.
        }
      
      //this loop checking each character that which have 1 frequency
        for(int i = 0; i < s.length(); i ++){
          //now here we have updated arr then we are checking that which have lowest frequency then we found it then we will return that index..
            if(freq [s.charAt(i) - 'a'] == 1)   
                return i;
            }
        return -1;
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //below code written by me but it is not an optimized solution it given 236 ms runtime and 67mp memory usage
//         int n = s.length();
//     String ans = "";
//     for(int i=0; i<n; i++){
//         if(!ans.contains(Character.toString(s.charAt(i))))
//             ans += s.charAt(i);
            
//       }
//       for(int i=0; i<ans.length(); i++){
//         int count = 0;
//         for(int j= 0; j<n; j++){
//           if(ans.charAt(i) == s.charAt(j)){
//             count += 1;
//           }
//         }
//         if(count == 1){
//             char ch = ans.charAt(i);
//           return s.indexOf(ch);
//         }
//       }
//     return -1;
    }
}
