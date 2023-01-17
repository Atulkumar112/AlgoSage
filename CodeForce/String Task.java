import java.util.*;

public class Codeforce {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the value:- ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Character> list = Arrays.asList('A','E','I','O','U','Y','a','e','i','o','u','y');
		
		String ans ="";
		for(int i=0; i<s.length(); i++) {
			if(!list.contains(s.charAt(i))) {
				ans+=s.charAt(i);
			}
		}
		
		char[] ch = ans.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
		}
		
		String res ="";
		for(int i=0; i<ch.length; i++) {
			res+=".";
			res+=ch[i];
		}
		
		System.out.println(res);
		
	}
}
