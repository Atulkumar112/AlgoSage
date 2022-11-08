class Solution {
    public String makeGood(String s) {
         // i write here 32 because the differnece between the upper letter and lower leter in ACII value is 32. Lets exmaple a = 97 and A = 65 so a-A = 97-65 => 32
        
        //recursion approach 
//         for(int i=0; i<s.length()-1; i++){
//             // if(s.charAt(i) == s.charAt(i+1)+32 || s.charAt(i)+32 == s.charAt(i+1)){
//             if(Math.abs(s.charAt(i) - s.charAt(i+1))==32){
//                 return makeGood(s.substring(0, i) + s.substring(i+2));
                
//             }
            
//         }
        
//         return s;
        
        
        // for iterative approach using stack
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            
            if(!st.isEmpty() && Math.abs(st.peek()-c) == 32){
                st.pop();
            
            }
            else{
                st.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();

    }
}
