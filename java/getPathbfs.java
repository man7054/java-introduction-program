package graph1.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class getPathbfs {
    public static ArrayList<Integer>getPathBfs(int[][]adjMatrix,int s,int e){
    	Queue<Integer>pending=new LinkedList<Integer>();
    	HashMap<Integer,Integer>map=new HashMap<>();
    	boolean[] visited=new boolean[adjMatrix.length];
    	visited[s]=true;
    	pending.add(s);
    	map.put(s,-1);
    	boolean pathfound=false;
    	while(!pending.isEmpty()) {
    		int current=pending.poll();
    		for(int i=0;i<adjMatrix.length;i++) {
    			if(adjMatrix[current][i]==1&&!visited[i]) {
    			pending.add(i);
    			visited[i]=true;
    			map.put(i,current);
    			if(i==e) {
    				pathfound=true;
    				break;
    			}
    		}
    	  }
    	}
    	if(pathfound) {
    		ArrayList<Integer>path=new ArrayList<Integer>();
    		int current=e;
    		while(current!=-1) {
    			path.add(current);
    			int parent=map.get(current);
    			current=parent;
    		}
    		return path;
    	}
    	else {
    		return null;
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
		int source=sc.nextInt();
		int dest=sc.nextInt();
     ArrayList<Integer>ans= getPathBfs(adjMatrix,source,dest);
     for(Integer i:ans) {
    	 System.out.print(i+" ");
     }
	}



}