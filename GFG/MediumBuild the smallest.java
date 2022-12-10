
class Solution {
    static String buildLowestNumber(String num, int k) {
        StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		for(char c: num.toCharArray()){
		    while(!st.isEmpty() && st.peek()>c && k>0){
		        st.pop();
		        k--;
		    }
		    st.push(c);
		}
		
		while(!st.isEmpty() && k>0){
		    st.pop();
		    k--;
		}
		
		while(!st.isEmpty()){
		    sb.append(st.pop());
		}
		
		while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
		  //  sb.deleteCharAt(sb.length()-1);
		  sb.setLength(sb.length()-1);      
		}
		
		if(sb.length()==0) return "0";
		
		return sb.reverse().toString();
    }
}
