package Array2d.java;

import java.util.Scanner;

public class RowWiseSum {
    public static void  rowwiseSum(int[][]mat) {
    	  if(mat.length==0){
              System.out.println();
          }
          else{
         int m=mat.length;
        int n=mat[0].length;
          if(n>=0&&m>=0){
          for(int i=0;i<m;i++){
               int sum=0;
              for(int j=0;j<n;j++){
              sum=sum+mat[i][j];
              }
              System.out.print(sum+" ");
          }
          }
          else{
              System.out.print(0);
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

		rowwiseSum(arr);
	}

}
