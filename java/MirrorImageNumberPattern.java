package pattern2.java;
import java.util.*;
public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space-i+1;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
				}
			
			System.out.println();
		}


	}

}
