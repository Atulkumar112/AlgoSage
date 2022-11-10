class Solution {
    public String removeDuplicates(String s) {
        
        // below code written by me within 4 minutes
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<s.length(); i++){
//             if(!st.isEmpty() && st.peek() == s.charAt(i)){
//                 st.pop();
//             }
//             else{
//                 st.push(s.charAt(i));    
//             }
//         }
        
//         StringBuilder sb = new StringBuilder();
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
        
//         return sb.reverse().toString();
        
        //
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; j++, i++) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
}
