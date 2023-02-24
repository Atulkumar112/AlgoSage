//User function Template for Java
class Node{
    int v;
    int w;
    public Node(int v, int w){
        this.v = v;
        this.w = w;
    }
}

class Solution {
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        List<List<Node>> adj = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> curved = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> list: edges){
            adj.get(list.get(0)).add(new Node(list.get(1), list.get(2)));
            adj.get(list.get(1)).add(new Node(list.get(0), list.get(2)));
            
            // temp list
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(list.get(0)); temp.add(list.get(1)); temp.add(list.get(3)); // for curved wt
            curved.add(temp);
        }
        
        int[] disa = dijkstra(adj, a, n);
        int[] disb = dijkstra(adj, b, n);
        
        int ans = disa[b];
        
        //consider all poss curved wt at max 1 -> hence itr in each poss
        for(int i=0; i<m; i++){
            int u = curved.get(i).get(0);
            int v = curved.get(i).get(1);
            int cw = curved.get(i).get(2);
            
            ans = Math.min(ans, cw+disa[u]+disb[v]);
            ans = Math.min(ans, cw+disa[v]+disb[u]);
        }
        
        if(ans>=1000000001) return -1;
        
        return ans;
    }
    
    
    static int[] dijkstra( List<List<Node>> adj , int start, int n)
    {
        // sorting in asc order of src-> target dist
        int dis[] = new int[n+1];
        Arrays.fill(dis, 1000000001);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> { return x.w - y.w; }); 
        
        
        dis[start]=0;
        
        pq.add(new Node(start,0)); //1sr para is target and 2nd para is dist from src(2) to target
        
        while(!pq.isEmpty())
        {
            Node curr_node =pq.poll();  // VlogV
            for(Node nei : adj.get(curr_node.v))  // ElogV
            {
                // u -> v if(d[v] > d[u] + w[u,v]) d[v] = d[u] + w[u,v])
                //d[v] = dis[nei.v] , d[u] = dis[curr_node.v]  , w[u,v] = nei.w
                if(dis[nei.v] > dis[curr_node.v] + nei.w)
                {
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.add(new Node(nei.v , dis[nei.v])); // passing the targer and its updated wt from src(2) to target
                }   
            }
        }
        return dis;
    }
};
