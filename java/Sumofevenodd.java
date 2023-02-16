package Lecture4.java;
import java.util.*;
public class Sumofevenodd {

	public static void main(String[] args) {
		  int evensum=0;
	        int oddsum=0;
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        while(n>0){
	            int r=n%10;
	            if(r%2==0){
	                evensum=evensum+r;
	            }
	            else{
	                oddsum=oddsum+r;
	            }
	            n=n/10;
	        }
	        System.out.println(evensum +" "+ oddsum);

	}

}
