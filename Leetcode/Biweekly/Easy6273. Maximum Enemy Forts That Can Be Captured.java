class Solution {
    public int captureForts(int[] forts) {
        // forts = [1,0,0,-1,0,0,0,0,1]
        // [1,-1,-1,1,1]
        int n = forts.length;
        int ans=0;
        
        for(int i=0; i<n; i++){
            int count=0;
            if(forts[i]==1){
                for(int j=i+1; j<n; j++){
                    if(forts[j]==-1){
                        ans = Math.max(ans, count);
                        break;
                    }
                    else if(forts[j] == 1){
                        break;
                    }
                    else{
                        count++;
                    }
                }
            }
        }
        
        for(int i=n-1; i>=0; i--){
            int count=0;
            if(forts[i]==1){
                for(int j=i-1; j>=0; j--){
                    if(forts[j]==-1 ){
                        ans = Math.max(ans, count);
                        break;
                    }
                    else if(forts[j] == 1){
                        break;
                    }
                    else{
                        count++;
                    }
                }
            }
        }
        
        return ans;
    }
}
