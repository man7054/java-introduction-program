package Lecture4.java;
import java.util.*;
public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        while(s<=e){
            double c=(s-32)*(5.0/9);
            int d=(int)c;
            System.out.println(s +" "+d);
            s=s+w;
        }

	}

}
