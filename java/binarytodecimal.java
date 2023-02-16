package Lecture7.java;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0,b=1;
        while(n>0){
            int d=n%10;
            n=n/10;
            dec=dec+(d*b);
            b=b*2;
        }
System.out.println(dec);
	}

}
