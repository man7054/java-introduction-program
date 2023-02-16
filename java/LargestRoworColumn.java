package Array2d.java;

import java.util.Scanner;

public class LargestRoworColumn {
	public static void findLargest(int mat[][]){
		int m=mat.length;
		int n=mat[0].length;
		int rowsum=Integer.MIN_VALUE;
		int colsum=Integer.MIN_VALUE;
		int row=0;
		int col=0;
		for(int i=0;i<m;i++) {
			int rsum=0;
			for(int j=0;j<n;j++) {
				rsum=rsum+mat[i][j];
			}
			if(rsum>rowsum) {
				rowsum=rsum;
				row=i;
			}
		}
		for(int j=0;j<n;j++) {
			int csum=0;
			for(int i=0;i<m;i++) {
				csum=csum+mat[i][j];
			}
			if(csum>rowsum) {
				colsum=csum;
				col=j;
			}
		}
		if(rowsum<colsum) {
			System.out.print("column "+col+":"+colsum);
		}
		else {
			System.out.print("row "+row+":"+rowsum);
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
		findLargest(arr);
	}

}
