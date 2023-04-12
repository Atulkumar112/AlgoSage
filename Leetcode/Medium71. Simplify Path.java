//Below code is written by me but i saw the approach from ayushi sharma wallmart
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        int n = path.length();

        for(int i=0; i<n; i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            else{
                String temp = "";
                while(i< n && path.charAt(i)!='/'){
                    temp += path.charAt(i);
                    i++;
                }
                System.out.println(temp);
                if(temp.equals("..")){
                    System.out.println("atul");  // just for SKL
                    if(!st.isEmpty()){
                        System.out.println(st.peek()+" peek ele");  // just for SKL
                        st.pop();
                    }
                    
                }
                else if(temp.equals(".")){
                    continue;
                }
                else {
                    st.push(temp);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if(st.isEmpty()){
            sb.append("/");
        }
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
            sb.insert(0, "/");
        }
    
        return sb.toString();
    }
}






// below code i written by me but only 8 TC passed out of 258 but n problem atul 
// you well tried, just keep it up! :)
// class Solution {
//     public String simplifyPath(String path) {
//         Stack<Character> st = new Stack<>();
//         int n = path.length();
//         int idx=-1;
//         for(int i=0; i<n; i++){
//             if(path.charAt(i)=='/'){
//                 st.push('/');
//                 idx=i;
//                 break;
//             }
//         }

//         for(int i=idx+1; i<n; i++){
            
//             if(path.charAt(i) >= 97 && path.charAt(i) <= 122){
                
//                 while(path.charAt(i)!='/'){
//                     st.push(path.charAt(i));
                    
//                     i++;
//                 }
//                 st.push(path.charAt(i));
//             }
//             else if(path.charAt(i) == '/' && st.peek()!='/'){
                
//                 st.push(path.charAt(i));
//             }
//         }

//         StringBuilder sb = new StringBuilder();
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//         sb.reverse();

//         if(sb.length() > 1 && sb.charAt(sb.length()-1) == '/'){
//             sb.setLength(sb.length()-1);
//         }

//         return sb.toString();
//     }
// }
