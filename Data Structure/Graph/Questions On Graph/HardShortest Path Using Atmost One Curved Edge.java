// User function Template for Java
class Node{
    int v;
    int w;
    public Node(int v, int w){
        this.v = v;
        this.w = w;
    }
}
// below code is written by my hand :)
class Solution {
    
    int dis[];
    int minimumCost(int[][] flights, int n, int k) {
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
      List<List<Node>> adj = new ArrayList<>();
      
      for(int i=0; i<=n; i++){
          adj.add(new ArrayList<>());
      }
      
      for(int[] arr: flights){
          adj.get(arr[0]).add(new Node(arr[1], arr[2]));
      }
      
      dijkstra(adj, k);
      
      int ans=0;
      for(int i=1; i<dis.length; i++){
          ans = Math.max(ans, dis[i]);
      }
      
      return ans==Integer.MAX_VALUE ? -1 : ans;
      
      
    }
    
    public void dijkstra(List<List<Node>> adj, int start){
        // i am just using here custom comparator in PQ for sorting in ascendig order 
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> {return x.w - y.w; });
        
        dis[start]=0;
        
        pq.add(new Node(start, 0));  // first para is target and 2nd para is dist from src(2) to target
        
        while(!pq.isEmpty()){
            Node curr_node = pq.poll();
            for(Node nei: adj.get(curr_node.v)){
                
                if(dis[nei.v] > dis[curr_node.v] + nei.w){
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.add(new Node(nei.v, dis[nei.v])); // passing the target and its updated wt
                }
            }
        }
    }
}
