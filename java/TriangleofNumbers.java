package pattern2.java;
import java.util.*;
public class TriangleofNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=1;
		int k;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(st);
				st=st+1;
			}
			if(k>i) {
				st=st-1;
				for(int p=1;p<i;p++) {
					st=st-1;
					System.out.print(st);
					
				}
			}
			System.out.println();
			st=k;
		}

	}

}
