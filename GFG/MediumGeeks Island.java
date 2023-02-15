
class Solution{
	int water_flow(int [][] arr, int r, int c) {
	    
		// create two boolean arr for india and arib
		boolean[][] ind = new boolean[r][c];
		boolean[][] arab = new boolean[r][c];
		
		//call dfs for indian - 1st row and 1st col
		for(int i=0; i<c; i++) dfs(arr, 0, i, ind, r, c);
		for(int i=0; i<r; i++) dfs(arr, i, 0, ind, r, c);
		
		//call dfs for Arabia Sea - 1st row and 1st col
		for(int i=0; i<r; i++) dfs(arr, i, c-1, arab, r, c);
		for(int i=0; i<c; i++) dfs(arr, r-1, i, arab, r, c);
		
		// ind and arab arraya has true
		int ans=0;
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		        if(ind[i][j] && arab[i][j]){
		            ans++;
		        }       
		    }
		}
		
		return ans;
	}
	
	void dfs(int[][] arr, int i, int j, boolean[][] vis, int r, int c){
	    if(i<0 || i>=r || j<0 || j>=c || vis[i][j]){
	        return;
	    }
	    
	    vis[i][j]=true;
	    
	    if(j+1<c && !vis[i][j+1] && arr[i][j+1]>=arr[i][j]){
	        dfs(arr, i, j+1, vis, r, c);
	    }
	    if(i+1<r && !vis[i+1][j] && arr[i+1][j]>=arr[i][j]){
	        dfs(arr, i+1, j, vis, r, c);    
	    }
	    if(j-1>=0 && !vis[i][j-1] && arr[i][j-1]>=arr[i][j]){
	        dfs(arr, i, j-1, vis, r, c);    
	    }
	    
	    if(i-1>=0 && !vis[i-1][j] && arr[i-1][j]>=arr[i][j]){
	        dfs(arr, i-1, j, vis, r, c);    
	    }
	  
	}
}
