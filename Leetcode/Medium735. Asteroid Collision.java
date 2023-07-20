// 225 TC passed form 275. Well tried atul during the job :)
// class Solution {
//     public int[] asteroidCollision(int[] ast) {
//         Stack<Integer> st = new Stack<>();
//         int n = ast.length;
//         st.push(ast[0]);
//         for(int i=1; i<n; i++){
//             if(ast[i] > 0){
//                 st.push(ast[i]);
//             }
//             else if(!st.isEmpty() &&  st.peek() < 0){
//                 st.push(ast[i]);
//             }
//             else{
//                 while(!st.isEmpty()){
//                     int check = st.peek();
//                     if(check == ast[i] * (-1)){
//                         st.pop();
//                         break;
//                     }
//                     else if(check < 0 && ast[i]< 0){
//                         st.push(ast[i]);
//                         break;
//                     }
//                     else if(check == ast[i]){
//                         st.push(ast[i]);
//                         break;
//                     }
//                     else if(check < ast[i] * (-1)){
//                         st.pop();
//                     }
//                     else if(check > ast[i] * (-1)){
//                         break;
//                     }
//                 }
//                 // if(st.isEmpty()){
//                 //     st.push(ast[i]);
//                 // }
//             }
//         }

//         List<Integer> list = new ArrayList<>();
//         while(!st.isEmpty()){
//             list.add(st.pop());
//         }
//         int len = list.size();
//         int arr[] = new int[len];
//         int j=0;
//         for(int i=len-1; i>=0; i--){
//             arr[j] = list.get(i);
//             j++;
//         }

//         return arr;
//     }
// }

//----------------------------------------------------------------------------
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (stk.isEmpty() || asteroids[i] > 0) {
                stk.push(asteroids[i]);
            } else {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }

                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } else {
                    if (stk.isEmpty() || stk.peek() < 0) {
                        stk.push(asteroids[i]);
                    }
                } 
            }
        }
        
        int[] ans = new int[stk.size()];
        int size = stk.size();
        while (!stk.isEmpty()) {
            ans[--size] = stk.pop();
        }
        
        return ans;
    }
}
