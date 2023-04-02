class Pair{
    int a;
    int b;
    Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}

class Solution{
    public int knightInGeekland(int arr[][], int start_x, int start_y){
        int r = arr.length, c=arr[0].length;
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        Queue<Pair> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        boolean[][] vis = new boolean[r][c];
        q.add(new Pair(start_x, start_y));
        vis[start_x][start_y]=true;
        
        while(!q.isEmpty()){
            int size = q.size();
            int curr_lev_pts =0;
            
            for(int i=0; i<size; i++){
                Pair curr = q.poll();
                int x = curr.a, y=curr.b;
                curr_lev_pts += arr[x][y];
                //visi all its knight 8 moves
                for(int j=0; j<8; j++){
                    int n_x = x+dx[j];
                    int n_y = y+dy[j];
                    if(is_safe(n_x, n_y, r, c) && !vis[n_x][n_y]){
                        vis[n_x][n_y]=true;
                        q.add(new Pair(n_x, n_y));
                    }
                }
            }
            list.add(curr_lev_pts);
        }
        // just for see the elements in list
        // for(int x: list){
        //     System.out.print(x+" ");
        // }
        int max = Integer.MIN_VALUE; int ans=-1;
        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i)+i<list.size()){
                // list.set(i, list.get(i)+ list.get(list.get(i)));
                list.set(i, list.get(i)+list.get(i+list.get(i)));
            }
        }
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
                ans = i;
            }
        }
        return ans;
    }
     boolean is_safe(int i, int j, int r, int c){
         if(i>=0 && j>=0 && i<r && j<c){
             return true;
         }
         return false;
     }
}   
