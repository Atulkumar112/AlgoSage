//Finally i written this code by my own :)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        st.push(s.charAt(0));   
        for(int i=1; i<n; i++){
            if(!st.isEmpty()){
                char ch = st.peek();
                if(ch=='(' && s.charAt(i)==')' )   {
                    st.pop();
                }
                else if(ch=='[' && s.charAt(i)==']' )   {
                    st.pop();
                }
                else if(ch=='{' && s.charAt(i)=='}' )   {
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty() ? true : false;
    }
}
