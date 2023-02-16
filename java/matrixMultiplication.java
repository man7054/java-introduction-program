package Array2d.java;
import java.util.*;
public class matrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first mat detail");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int[][]mat1=new int[row1][col1];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second mat detail");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		int[][]mat2=new int[row2][col2];
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		int[][]ans=new int[row1][col2];
		if(col1!=row2) {
			System.out.println("Invalid Matrix size");
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1;k++) {
					ans[i][j]+=(mat1[i][k]*mat2[k][j]);
				}
			}
		}
     for(int i=0;i<ans.length;i++) {
    	 for(int j=0;j<ans[0].length;j++) {
    		 System.out.print(ans[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}

}
