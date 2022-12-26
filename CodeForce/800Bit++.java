import java.util.*;

public class Codeforce{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		while(n-->0) {
			String op = sc.next();
			if(op.contains("+")) {
				x++;
			}
			else {
				x--;
			}
		}
		System.out.println(x);
	}
}
