class Solution {
    public int uniquePaths(int m, int n) {
        // with recursion but not using memoization 
        // int ans = rec(0, 0, m-1, n-1);
        
        // just try memoization 
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = memo(0, 0, m-1, n-1, hm);
        
        
        return ans;
    }
    
    // time limite exeed with this below code with recursion (without memoization)
    private int rec(int si, int sj, int ei, int ej){
        if(si == ei && sj==ej){
            return 1;
        }
        if(si>ei || sj>ej){
            return 0;
        }
        
        int opt1 = rec(si+1, sj, ei, ej);
        int opt2 = rec(si, sj+1, ei, ej);
        return opt1 + opt2;
    }
    
    //below funtion is written like memoization. memoiztion means we are reducing the time to finding the same solution
    
    private int memo(int si, int sj, int ei, int ej, HashMap<String, Integer> hm){
        if(si == ei && sj==ej){
            return 1;
        }
        if(si>ei || sj>ej){
            return 0;
        }
        
        String key = si+"&"+sj;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        
        int opt1 = memo(si+1, sj, ei, ej, hm);
        int opt2 = memo(si, sj+1, ei, ej, hm);
        hm.put(key, opt1+opt2);
        return opt1 + opt2;
    }
}
