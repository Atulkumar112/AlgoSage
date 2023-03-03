
import java.util.*;

public class Codeforce {
	public static void main(String[] args) {
		System.out.println("enter ht evlaue: ");
		Scanner sc = new Scanner(System.in);
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		int ans=0;
		while(w1<=w2) {
			w1 = w1*3;
			w2 = w2*2;
			ans++;
		}
		System.out.println(ans);	
	}
}
