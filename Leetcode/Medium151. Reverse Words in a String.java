class Solution {
    public String reverseWords(String s) {
        s.trim();
        Stack<String> st = new Stack<>();
        String ans ="";
       for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                if(ans.length() != 0){
                    st.push(ans);    
                }
                ans = "";
            }
           else{
               ans+= s.charAt(i);
           }
       }
        st.push(ans);
        // String res = "";
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            System.out.println(st.peek());
            sb.append(st.pop()).append(" ");
            
        }
        return sb.toString().trim();
    }
}
