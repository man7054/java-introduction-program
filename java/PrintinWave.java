package Array2d.java;

import java.util.Scanner;

public class PrintinWave {
    public static void  print2DinWave(int[][]mat) {
    	int row=mat.length;
    	int col=mat[0].length;
    	int i=0,j=0;
		while(j<col){
		    if(j%2==0){
		        for(i=0;i<row;i++){
		           System.out.println(mat[i][j]);
		        }
		    }
		    else{
		      for(i=row-1;i>=0;i--){
		           System.out.println(mat[i][j]);
		        } 
		    }
		    
		    j++;
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
        print2DinWave(arr);

	}

}
