class Solution { 
        public int minLength(String s, int n) { 
     Stack<Integer> st = new Stack<>();
        for(char c : s.toCharArray()){
            int x = c-'0';
            if(st.isEmpty())st.add(x);
            else if((st.peek() == 0 && x == 9) || (st.peek() == 9 && x == 0))st.pop();
            else if(st.peek()%2 == 0 && st.peek() == x+1)st.pop();
            else if(st.peek()%2 != 0 && st.peek() == x-1)st.pop();
            else st.add(x);
        }
        return st.size();
    }
}
