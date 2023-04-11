//Below is the my solution which is done with in 3 mintutes in one attempts submitted :)
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(!st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}


//second approach
// class Solution {
//     public String removeStars(String s) {
//         StringBuilder res = new StringBuilder();
//         for (char c : s.toCharArray())
//             if (c == '*')
//                 res.setLength(res.length() - 1);
//             else
//                 res.append(c);
//         return res.toString();
//     }
// }
