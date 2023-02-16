package Lecture7.java;
import java.util.*;
public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean p[]=new boolean[n+1];
		for(int i=0;i<=n;i++){
			p[i]=true;
		}
		for(int j=2;j*j<=n;j++){
			if(p[j]==true){
				for(int k=j*j;k<=n;k+=j){
					p[k]=false;
				}
			}
		}
   for(int i=2;i<=n;i++){
	if(p[i]==true){
		System.out.println(i);
	}
}
		
		

	}

}
