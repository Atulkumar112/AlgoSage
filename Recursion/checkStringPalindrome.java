
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
        
