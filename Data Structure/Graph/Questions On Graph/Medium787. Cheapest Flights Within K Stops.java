// algorithm uses:- Bellman Ford with some Comments.

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        for(int i=0;i<=k;i++){// for k=1,from starting node to
// 1 stop then to destination
        //so loop runs k+1 times
            int cost[]=Arrays.copyOf(dis,n);
            for(int x[]:flights){
                int u=x[0],v=x[1];
                int fare=x[2];
                if(dis[u]==Integer.MAX_VALUE)continue;//as we must start from src
                if(dis[u]+fare<cost[v])
                    cost[v]=dis[u]+fare;
                //if we write this line 
                 //dis[v]=dis[u]+fare;
                 //the purpose of using k loops is defeated as 
            //     for thr next iteration of this loop(flights) dis[u] will not be Int.MAX
 //and consequently all other indexes will 
//be taken in to consideration which is not allowed as 
//per the question.Only the precomputed nodes should be considered
                 //we must only start from the nodes whose dis in not INTMAX

                // System.out.println(dis[v]+" "+u+" "+v);
                
            }
             dis=cost;
        }
        return dis[dst]==Integer.MAX_VALUE?-1:dis[dst];
    }
}
