import java.util.*;

public class TheatreSquare {	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		long n,m,a;
		
		n = sc.nextLong();
		m = sc.nextLong();
		a = sc.nextLong();
		
		long x=m/a;
		long y=n/a;
		if(m%a!=0) {
			++x;
		}
		if(n%a!=0) {
			++y;
		}
		
		System.out.println(x*y);
	}
}

