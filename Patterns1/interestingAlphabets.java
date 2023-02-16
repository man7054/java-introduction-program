package Patterns1;
import java.util.*;
public class interestingAlphabets {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        char c;
	        int n=sc.nextInt();
	         c=(char) ('A'+(n-1));
	        int j;
	        for(int i=0;i<n;i++){
	            char s=c;
	            for( j=0;j<=i;j++){
	                 
	                System.out.print(c);
	               c=(char)(c+1);
	            }
	            System.out.println();
	           c=(char) (s-1);
	            
	        }

	}

}
