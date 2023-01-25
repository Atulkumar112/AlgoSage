class Solution {

    public void dfs(int i, int distance, int[] edges, int[] path){
        if(i!=-1 && path[i]==-1){
            path[i]=distance;
            dfs(edges[i], distance+1, edges, path);
        }
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int ans=-1;
        int minDistance = Integer.MAX_VALUE;
        int n=edges.length;

        int[] path1 = new int[n];
        int[] path2 = new int[n];

        Arrays.fill(path1, -1);
        Arrays.fill(path2, -1);

        dfs(node1, 0, edges, path1);
        dfs(node2, 0, edges, path2);

        for(int i=0; i<n; i++){
            if(Math.min(path1[i], path2[i])>=0 && Math.max(path1[i], path2[i])<minDistance){
                minDistance=Math.max(path1[i], path2[i]);
                ans=i;
            }
        }

        return ans;
    }
}
