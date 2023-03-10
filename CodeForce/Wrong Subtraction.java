import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		while(k>0) {
			if((Integer.toString(n)).charAt(Integer.toString(n).length()-1)=='0') {
				n/=10;
			}
			else {
				n-=1;
			}
			k--;
		}
		System.out.println(n);
	}
}
