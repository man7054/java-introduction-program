package Lecture7.java;
import java.util.Scanner;
public class SumorProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  int c=sc.nextInt();
	        int s=1;
	        if(c==1){
	            s=(n*(n+1))/2;
	        }
	        else if(c==2){
	            for(int i=1;i<=n;i++){
	                s=s*i;
	            }
	        }
	        else{
	            s=-1;
	        }
	System.out.println(s);

	}

}
