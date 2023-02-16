package recursion1.java;

public class PrintFirstNNaturalNumbers {
	public static void print(int n) {
		if(n==0) {
			return;
		}
		else {
			print(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int n=5;
		print(n);

	}

}
