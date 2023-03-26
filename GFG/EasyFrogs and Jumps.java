
class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        
        int count=0;
        int[] vis = new int[leaves+1];
        
        for(int i=0; i<N; i++){
            int pos = frogs[i];
            if(pos<=leaves && vis[pos]==0){
                int temp=pos;
                while(temp<=leaves){
                    if(vis[temp]==0){
                        vis[temp]=1;
                    }
                    temp+=pos;
                }
            }
        }
        
        for(int i=1; i<leaves+1; i++){
            if(vis[i]==0){
                count++;
            }
        }
        return count;
        
    }
}

// below code is written by me and given the TLE. of course. 1061/1065 tet
//cases passed
// class Solution {
//     public int unvisitedLeaves(int N, int leaves, int frogs[]) {
//         int count=0;
//         int n = frogs.length;
        
//         for(int i=1; i<=leaves; i++){
//             boolean flag=true;
//             for(int j=0; j<n; j++){
//                 if(i%frogs[j]==0){
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag){
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }

