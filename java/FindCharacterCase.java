package Lecture4.java;
import java.util.*;
public class FindCharacterCase {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
	        char b;
	        b=s.next().charAt(0);
	        int n=b;
	        if(n>=65&&n<=90){
	            System.out.println(1);
	        }
	        else if(n>=97&&n<=122){
	            System.out.println(0);
	        }
	        else{
	            System.out.println(-1);
	        }

	}

}
