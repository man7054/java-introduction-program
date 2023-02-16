package Arrays1.java;
import java.util.*;
public class LinearSearch {
    public static boolean linearSearch(int[]arr,int x) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==x) {
    			return true;
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(linearSearch(arr,x));

	}

}
