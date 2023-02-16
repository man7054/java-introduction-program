package recursion1.java;

public class SumOfArray {
	public static int sum=0;
	public static int arrsum(int[]arr,int n) {
		if(n<=0) {
			return 0;
		}
	    sum=sum+(arrsum(arr,n-1)+(arr[n-1]));
	    return sum;
	}
	public static void main(String[] args) {
		int[]arr= {9,8,9};
		int n=arr.length;
		System.out.print(arrsum(arr,n));

	}

}
