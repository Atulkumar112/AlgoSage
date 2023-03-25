class Solution {
    long ans=0;
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    private void dfs(int currIdx){
        visited.add(currIdx);
        ans++;
        List<Integer> neig = map.get(currIdx);

        for(int i=0; i<neig.size(); i++){
            if(visited.contains(neig.get(i))){
                continue;
            }
            dfs(neig.get(i));
        }
    }

    private void constructAdjList(int n, int[][] edges){
        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            List<Integer> list = map.get(u);
            list.add(v);
            map.put(u, list);
            //similarly for v (couse of undirected graph)
            list = map.get(v);
            list.add(u);
            map.put(v, list);
        }
    }
    public long countPairs(int n, int[][] edges) {
        constructAdjList(n, edges);    
        long totalPairs=0;
        for(int i=0; i<n; i++){
            if(!visited.contains(i)){
                ans=0;
                dfs(i);
                totalPairs+=ans*(n-ans);
            }
        }
        return totalPairs/2;
    }
}
