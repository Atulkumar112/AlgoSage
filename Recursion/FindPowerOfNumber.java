public class FindPowerOfNumber {
    
    public static long power(int X, int N){
      
      if(N==0) return 1;
        long ans = power(X, N-1);
        
        return X * ans;
    }
  
public static void main(String[] args) {
    int x = 3;
    int n = 4;
    System.out.println(power(x, n));
  }
}
