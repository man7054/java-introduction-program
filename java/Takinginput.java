package Array2d.java;

import java.util.Scanner;

public class Takinginput {
	public static void takeinputout(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
       takeinputout(arr);
	}

}
