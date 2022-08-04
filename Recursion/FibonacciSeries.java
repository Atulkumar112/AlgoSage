//1 2 3 4 5 6 7 8 
//0 1 1 2 3 5 8 13

public class FibonacciSeries{
  static int fiboRecur(int n){
    if(n==1){
      return 0;
    }
    if(n==2){
      return 1;
    }
    
    return fiboRecur(n-1) + fiboRecur(n-2);
    
  }
  public static void main(String[] args) {
    int n = 8;
    System.out.println(fiboRecur(n));
  }
}
