package Lecture4.java;
import java.util.*;
public class Findpowerofanumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int x= sc.nextInt();
	        int n= sc.nextInt();
	        int sq=1;
	        while(n>0){
	            sq=sq*x;
	                n=n-1;
	        }
	        
	      System.out.println(sq);

	}

}
