class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(0);
        dfs(0, graph.length-1, curr, ans, graph);
        return ans;

    }

    public void dfs(int src, int dest, List<Integer> curr, List<List<Integer>> ans, int[][] graph){
        if(src==dest){
            ans.add(new ArrayList(curr));
            return;
        }

        for(int a: graph[src]){
            curr.add(a);
            dfs(a, dest, curr, ans, graph);       // DFS
            curr.remove(curr.size()-1);        //Backtracking
        }
    }
}
