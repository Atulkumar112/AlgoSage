class Solution
{
   private int time = 0;
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        int disc[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];
        int parent[] = new int[V];
        boolean ap[] = new boolean[V];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.fill(parent, -1);
        
        for(int i=0; i<V; i++){
            if(vis[i] == false){
                ArticulationPoint(i, adj, disc, low, vis, parent, ap);
            }
        }
        for(int i=0; i<V; i++){
            if(ap[i] == true){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
            return list;
        }
        Collections.sort(list);
        return list;
    }
    
    private void ArticulationPoint(int u, ArrayList<ArrayList<Integer>> adj, int disc[], int low[],
        boolean []vis, int parent[], boolean []ap){
        vis[u] = true;
        disc[u] = low[u] = time++;
        int children = 0;
        for(int v : adj.get(u)){
            if(vis[v] == false){
                children++;
                parent[v] = u;
                
                ArticulationPoint(v, adj, disc, low, vis, parent, ap);
                low[u] = Math.min(low[u], low[v]);
                if(parent[u] == -1 && children > 1){
                    ap[u] = true;
                }
                else if(parent[u] != -1 && low[v] >= disc[u]){
                    ap[u] = true;
                }
            }
            else{
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
