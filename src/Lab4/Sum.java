package Lab4;

public class Sum {
	public int sum(int n) {
		
		int sum = 0;
		String str1 = Integer.toString(n); 
		for(int i = 0;i<str1.length();i++) {
			int a = n%10;
			n /= 10;
			sum = sum + (a*a*a);
			}		
		return sum;		
	}
}
