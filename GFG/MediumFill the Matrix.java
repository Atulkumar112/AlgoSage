class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}



class Solution
{
    //Really it's very easy question.
    // TC is O(N*M) and SC O(N)
    // BFS approach used here 
	public static int minIteration(int N, int M, int x, int y){
		int[][] mat = new int[N][M];
		mat[x-1][y-1]=1;
		
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x-1, y-1));
		
		int level=0;
		
		while(!q.isEmpty()){
		    int qSize = q.size();
		    
		    while(qSize-->0){
		        Pair p= q.peek();
		        q.remove();
		        int i=p.first;
		        int j=p.second;
		        
		        if(j+1<M && mat[i][j+1]==0){  // moving right side
		            mat[i][j+1]=1;
		            q.add(new Pair(i, j+1));
		        }
		        
		        if(i+1<N && mat[i+1][j]==0){  // moving down side
		            mat[i+1][j]=1;
		            q.add(new Pair(i+1, j));
		        }
		        
		        if(i-1>=0 && mat[i-1][j]==0){ // moving Up side
		            mat[i-1][j]=1;
		            q.add(new Pair(i-1, j));
		        }
		        
		        if(j-1>=0 && mat[i][j-1]==0){  // moving left side
		            mat[i][j-1]=1;
		            q.add(new Pair(i, j-1));
		        }
		    }
		    
		    level++;
		    
		}
		return level-1;
		
	}
}
