
class Solution {
    static Integer[][] memo;
  public static int maxCoins(int N, int[] arr) {
      memo = new Integer[N+3][N+3];
    int[] newArr = new int[N+2];
    newArr[0]=1;
    newArr[N+1]=1;
    for(int i=0; i<N; i++){
        newArr[i+1]=arr[i];
    }
    
    return dfs(0, N+1, newArr);

  }
  
  public static int dfs(int l, int r, int[] newArr){
      int ans=0;
      if(memo[l][r]!=null) return memo[l][r];
      for(int i=l+1; i<r; i++){
          int temp = newArr[l]*newArr[i]*newArr[r] + dfs(l, i, newArr) + dfs(i, r, newArr);
          ans = Math.max(ans, temp);
      }
      
      return memo[l][r]=ans;
      
  }
}
     
