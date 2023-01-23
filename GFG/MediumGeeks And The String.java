
class Solution {
    public static String removePair(String s) {
        //i did this question within a 11 minutes and clear in first attempt :)
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==st.peek()){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        
        if(st.isEmpty()){
            return "-1";
        }
        
        String ans = "";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        
        return new StringBuilder(ans).reverse().toString();
        
    }
}
        
