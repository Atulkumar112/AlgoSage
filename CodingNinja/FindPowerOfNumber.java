public class FindPowerOfNumber{
    
    public static long power(int X, int N){
      
      long temp = X;
        if(N == 0){
            return 1;
        }
        for(int i=1; i<N; i++){
            temp = temp * X;
        }
        return temp;
    }
  
public static void main(String[] args) {
    int x = 3;
    int n = 4;
    
    System.out.println(power(x, n));
