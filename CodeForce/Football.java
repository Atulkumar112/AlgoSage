import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int j=0;
		int count=1;
		boolean b = true;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(j)==s.charAt(i)) {
				count++;
//				System.out.println(count+" "+"i = "+i+" j+ "+j);
				if(count+1>7) {
					b=false;
					System.out.println("YES");
					break;
				}
			}
			else {
				count=1;
				j=i;
			}
		}
		if(b) {
			System.out.println("NO");
		}
		
	}
}


