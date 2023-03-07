
import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		int n  =s.length();
		for(int i=0; i<n; i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		String ans="";
		if(n/2<count) {
			for(int i=0; i<n; i++) {
				ans+=Character.toUpperCase(s.charAt(i));
			}
		}

		else {
			for(int i=0; i<n; i++) {
				ans+=Character.toLowerCase(s.charAt(i));
			}
		}
		
		System.out.println(ans);
	}
}
