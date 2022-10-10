class Solution {
    public String breakPalindrome(String palindrome) {
        //below code is passing 26 test cases out of 30 
//         char[] arr = p.toCharArray();
//         if(arr.length<=1) return "";
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!='a'){
//                 arr[i]='a';
//                 return new String(arr); 
//             }
//         }
        
//         arr[arr.length-1]='b';
//         return String.valueOf(arr);
        
        //------------------------
         if(palindrome.length() <= 1){
            return "";
        }
        
        StringBuilder result = new StringBuilder(palindrome);
        for(int i = 0; i<palindrome.length(); i++){
            if(palindrome.charAt(i) > 'a'){
                result.setCharAt(i,'a');
                break;
            }
        }
        
        StringBuilder res = new StringBuilder(result.toString());
        if(res.reverse().toString().equals(result.toString())){
            result = new StringBuilder(palindrome);
            result.setCharAt(palindrome.length() -1,'b');
            return result.toString();
        }
        
        
        if(result.toString().equals(palindrome)){
            return "";
        }
        
        
        return result.toString();
    }
}
