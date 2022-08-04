// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

//withour recursion 
public class pattern2{
  public static void main(String[] args) {
    int n = 5;   
    for(int i=1; i<=n; i++){
      System.out.println();
      for(int j=1; j<=i; j++){
        System.out.print(" "+j);
      }
    }
  }
}


//with recursion 
public class pattern2{
  static void firstPattern(int n){
    if(n==0){
      return;
    }
    firstPattern(n-1);
    for(int i=1; i<=n; i++){
      System.out.print(" "+ i);  
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int n = 5;
    firstPattern(n);
  }
}
