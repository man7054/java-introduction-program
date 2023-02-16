package recursion1.java;

public class NumberofDigits {
	public static int rem=0;
	public static int count=0;
	public static int count(int n) {
		if(n==0) {
			return 1;
		}
		else {
			rem=n%10;
			count++;
			n=count(n/10);
			return count;
		}
		
		
	}
	public static void main(String[] args) {
		int n=65665697;
		System.out.print(count(n));

	}

}
