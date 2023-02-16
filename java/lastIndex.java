package recursion1.java;

public class lastIndex {
	public static int lastIndex(int input[],int x,int len) {
		if(len==0) {
			return -1;
		}
		else if(input[len-1]==x) {
			return len-1;
		}
		else {
			return lastIndex(input,x,len-1);
		}
	}
	public static void main(String[] args) {
		int[]arr= {9,0,10,8};
		int x=8;
		System.out.println(lastIndex(arr,x,arr.length));

	}

}
