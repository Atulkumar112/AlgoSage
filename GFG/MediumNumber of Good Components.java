class Solution {
   int v_count;
    int e_count;
    boolean vis[];
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        vis = new boolean[V+1];
        //dfs for all vertices
        int ans=0;
        for(int i=1; i<=V; i++)
        {
            if(!vis[i])
            {
                v_count=e_count=0;
                bfs(adj, i);
            
            if(e_count == (v_count *(v_count-1))) ans++;
            
            }
        }
        return ans;
        
    }
    void bfs(ArrayList<ArrayList<Integer>> adj, int st)
    {
        Queue<Integer> q = new LinkedList<>();
        vis[st] = true;
        v_count++;
        e_count += adj.get(st).size();
        q.add(st);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei : adj.get(node)){
                if(!vis[nei]){
                    vis[nei] = true;
                    v_count++;
                    e_count += adj.get(nei).size();
                    q.add(nei);
                }
            }
        }
    }
}
