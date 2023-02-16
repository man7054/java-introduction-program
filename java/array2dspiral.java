package Array2d.java;

import java.util.Scanner;

public class array2dspiral {
    public static void array2dSpiral(int[][]arr,int row,int col) {
    	int minrow=0;
    	int mincol=0;
    	int maxrow=row-1;
    	int maxcol=col-1;
    	int totalne=row*col;
    	int count=0;
    	while(count<totalne) {
    		//left wall
    		for(int i=minrow,j=mincol;i<maxrow&&count<totalne;i++) {
    			System.out.print(arr[i][j]+" ");
    			count++;
    		}
    		mincol++;
    		//bottom wall
    		for(int i=minrow,j=mincol;j<maxcol&&count<totalne;j++) {
    			System.out.print(arr[i][j]+" ");
    			count++;
    		}
    		maxrow--;
    		
    		//right wall
    		for(int i=maxrow,j=mincol;i>=minrow&&count<totalne;i--) {
    			System.out.print(arr[i][j]+" ");
    			count++;
    		}
    		maxcol--;
    		//top wall
    		for(int i=minrow,j=mincol;i<maxrow&&count<totalne;i++) {
    			System.out.print(arr[i][j]+" ");
    			count++;
    		}
    		minrow++;
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
		array2dSpiral(arr,row,col);
	}

}
