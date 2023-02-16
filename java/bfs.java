package graph1.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
   public static void bfs(int[][]adjMatrix) {
	   boolean[] visited=new boolean[adjMatrix.length];
	   for(int i=0;i<adjMatrix.length;i++) {
		   if(!visited[i]) {
			   print(adjMatrix,i,visited); 
		   }
	   }
	   
	   
   }
	public static void print(int[][] adjMatrix,int current,boolean[] visited) {
	   Queue<Integer>q=new LinkedList<>();
	   q.add(current);
	   visited[current]=true;
	   while(q.size()!=0) {
		   int first=q.remove();
		   System.out.print(first+" ");
		   for(int i=0;i<adjMatrix.length;i++) {
	   if(adjMatrix[current][i]==1&&visited[i]!=true) {
		   q.add(i);
		   visited[i]=true;
	       }
	     }
	 }
	
}
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int[][]adjMatrix=new int[n][n];
		for(int i=0;i<e;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjMatrix[v1][v2]=1;
			adjMatrix[v2][v1]=1;
		}
		bfs(adjMatrix);
    /* for(int i=0;i<n;i++) {
    	 for(int j=0;j<n;j++) {
    		 System.out.print(adjMatrix[i][j]+" ");
    	 }
    	 System.out.println();
     }*/
	}

}
