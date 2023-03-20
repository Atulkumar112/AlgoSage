// User function Template for Java
class Pair{
    int a;
    int b;
    public Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}


class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N, int M) {
        ArrayList<Pair> x = new ArrayList<>();
         ArrayList<Pair> y = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(grid.get(i).get(j)=='X')
                x.add(new Pair(i,j));
                
                if(grid.get(i).get(j)=='Y')
                y.add(new Pair(i,j));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<x.size(); i++)
        {
            for(int j=0; j<y.size();j++)
            {
                ans = Math.min(ans , Math.abs(x.get(i).a - y.get(j).a) + Math.abs(x.get(i).b - y.get(j).b)); ;
            }
        }
        return ans;
    }
};
