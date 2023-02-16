package Lecture7.java;

import java.util.Scanner;

public class checksequence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();   
		    int c=0; 
			int p=0;
			int inc =0;
			for(int i =0; i<n; i++)
			{
				c = sc.nextInt();
				
				if(c==p)
				{
					System.out.println("false");
					return;
				}
				
				else if(c<p)
				{
					if(inc>0)
					{
						System.out.println("false");
						return;
					}
				}
				
				else if(c>p && i>0)
				{
					inc++;
				}
				p=c;
			}
			
			System.out.println("true");

	}

}
