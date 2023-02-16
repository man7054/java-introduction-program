package pattern2.java;
import java.util.*;
public class Diamondofstars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nt=sc.nextInt();
		int m, n;
        for (m = 1; m <= nt; m++) {
 
            for (n = 1; n <= nt- m; n++) {
                System.out.print(" ");
            }
 
            for (n = 1; n <= 2*m-nt; n++) {
                System.out.print("*");
            }
 
      
            System.out.println();
        }
 
       
        for (m = nt - 1; m > 0; m--) {
 
         
            for (n = 1; n <= nt - m; n++) {
                System.out.print(" ");
            }
 
            
            for (n = 1; n <= 2*m-nt; n++) {
                System.out.print("*");
            }
 
         
            System.out.println();
        }
	}

}
