package Lecture7.java;
import java.util.*;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c;
		if(n==0) {
			System.out.print(a);
		}
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.print(b);

	}

}
