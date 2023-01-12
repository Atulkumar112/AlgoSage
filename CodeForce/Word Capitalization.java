import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the value:- ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans="";
		char ch = Character.toUpperCase(str.charAt(0));
		ans+=ch;
		ans += str.substring(1, str.length());
		System.out.println(ans);
	}
}
