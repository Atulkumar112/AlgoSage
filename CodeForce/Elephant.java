import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int step=0;
		if(n<=5) {
			step++;
			System.out.println(step);
		}
		else {
			while(n>5) {
				n-=5;
				step++;
			}
			step++;
			System.out.println(step);
		}
	}
}
