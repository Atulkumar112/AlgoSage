
public class Solution {
    //using Recursion
    public static Boolean checkPalindrome(String s, int l, int r){
            if(l >= r){
                return true;
            }
            
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        
           return checkPalindrome(s, l+1, r-1);
    }
    
    
    public static Boolean isPalindrome(String s) {
        // Write your code here..
        
        return checkPalindrome(s, 0, s.length()-1);
        
        
//         //using sting builder and iterative approach         
        

//         String ans = "";
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();
//         // we also can do this question using below for loop but on coding ninja it is shoing like time limit exceed so that's why we use above string builder..
// //         for(int i=s.length()-1; i>=0; i--){
// //             ans += s.charAt(i);
// //         }
//         String data = sb.toString();
//         if(data.equals(s)){
//             return true;
//         }
//         else{
//             return false;
//         }
    }
}
