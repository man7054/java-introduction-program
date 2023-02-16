package fuctionandscop.java;

public class FibonacciNumber {
	public static boolean perfectsqaur(int m){
        int x=(int)Math.sqrt(m);
        return (x*x==m);
    }
	public static boolean checkMember(int n){
		return 	perfectsqaur(5*n*n+4)||perfectsqaur(5*n*n-4);
	}

	public static void main(String[] args) {
		int n=4;
		System.out.print(checkMember(n));
	}

}
