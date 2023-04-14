//TC:- O(N) AND SC(N)
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Integer> stCol = new Stack<>();
        Stack<Integer> stRad = new Stack<>();
        
        stCol.add(color[0]);
        stRad.add(radius[0]);
        
        for(int i=1; i<N; i++){
            if(!stCol.isEmpty() && !stRad.isEmpty() && stCol.peek() == color[i] && stRad.peek()==radius[i]){
                stCol.pop();
                stRad.pop();
            }
            else{
                stCol.push(color[i]);
                stRad.push(radius[i]);
            }
        }
        int ans = 0;
        while(!stCol.isEmpty()){
            stCol.pop();
            ans++;
        }
        
        return ans;    
    }
}
        
