class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int n, int m)
    {
        
        // best approach ever Time and space complexity O(1)
        long mod = 1000000007;
        long total = ((m*n)%mod * (m*n-1)%mod)%mod;
        
        if(n>=1 && m>=2){
            total -= 4*(n-1)*(m-2);
        }
        if(m>=1 && n>=2){
            total -= 4*(m-1)*(n-2);
        }
        
        return total;
        
        // second approach
        
        // int dx[]={2,2,1,1,-1,-1,-2,-2};
        // int dy[]={-1,-1,-2,2,-2,2,-1,1};
        
        // long mod = 1000000007;
        // long total = ((m*n)%mod * (m*n-1)%mod)%mod;
        // long attack = 0;
        
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         // traverese for 8 moves
        //         for(int k=0; k<8; k++){
        //             int x = i+dx[k];
        //             int y = j+dy[k];
                    
        //             //this is in oud -> attack
        //             if(x>=0 && x<n && y>=0 && y<m){
        //                 attack++;
        //             }
        //         }
        //     }
        // }
        
        // return (total%mod - attack%mod)%mod;
    }
}
