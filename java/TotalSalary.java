package Lecture4.java;
import java.util.*;
public class TotalSalary {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        double total=0;
	        int basic=sc.nextInt();
	        char grade=sc.next().charAt(0);
	        double hra=(0.20*basic);
	        double da=(0.50*basic);
	        double pf=(0.11*basic);
	        int allow=0;
	        if(grade=='A'){
	            allow=1700;
	        }
	        else if(grade=='B'){
	            allow=1500;
	        }
	        else {
	            allow=1300;
	        }
	        
	        total=basic+hra+da+allow-pf;
	        
	        System.out.println(Math.round(total));


	}

}
