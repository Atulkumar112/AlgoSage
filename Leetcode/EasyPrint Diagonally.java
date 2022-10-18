class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int a[][])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int i , j , k ;
        
        for(i = 0 ; i < n ; i++){
            
            j = i ; k = 0;
            
            while(j >= 0){
                
                arr.add(a[k][j]);
                
                k += 1;
                j -= 1;
            }
            
        }
        
        
        for(i = 1 ; i < n ; i++){
            
            j = i; k = n-1;
            
            while(j <= n-1){
                
                arr.add(a[j][k]);
                
                j += 1;
                k -= 1;
            }
            
        }
        
        return arr;
    }
}

// 1 2 3
// 4 5 6
// 7 8 9
