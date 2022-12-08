import java.util.*;
 
public class CF {
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		
		if(n%2==0 && n!=2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
