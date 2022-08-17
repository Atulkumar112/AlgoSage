public class Practice {
  static void reverse(String s, int n){
    if(n<0){
      return ;
    }
    System.out.print(s.charAt(n));
    reverse(s, n-1);
  }
  public static void main(String[] args) {
    String s = "abcd";
    reverse(s, s.length()-1);
  }
}
