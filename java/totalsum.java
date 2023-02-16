package Array2d.java;

import java.util.Scanner;

public class totalsum {
    public static void TotalSum(int[][]mat) {
    	 int sum = 0;
         int n=mat.length;
       
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (i == j || (i + j) == n - 1) {
                     sum += mat[i][j];
                 }
                 else if (i == 0 || j == 0 || i == n - 1|| j == n - 1) {
                     sum += mat[i][j];
                 }
             }
         }
         System.out.println(sum);
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
		TotalSum(arr);
	}

}
