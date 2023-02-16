package Lecture7.java;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] arr=new int[100];
	        int i=0;
	        if(n==0){
	            System.out.print(0);
	        }
	        while(n>0){
	            int d=n%2;
	            n=n/2;
	          if(d==0){
	            arr[i]=0;  
	          }
	            else{
	                arr[i]=1;
	            }
	            i++;
	        }
	        int len=arr.length;
	        for(int j=i - 1;j>=0;j--){
	System.out.print(arr[j]);
	        }

	}

}
