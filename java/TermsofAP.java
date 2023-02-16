package Lecture7.java;

import java.util.Scanner;

public class TermsofAP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Write your code here
        double x=sc.nextDouble();
        int c=0;
        for(int i=1;i<100000;i++){
             int s=0;
            s=(3*i)+2;
            if(s%4!=0){
                System.out.print(s+" ");
                c++;
            }
          if(c==x){
                break;
            }  
            }


	}

}
