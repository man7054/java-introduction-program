package recursion1.java;

public class CheckNumberinArray {
	public static boolean checkNumber(int[] input, int x, int len) {
		if(len==0) {
			return false;
		}
		else if(input[len-1]==x) {
			return true;
		}
		else {
			return checkNumber(input,x,len-1);
		}
		
	}
	public static void main(String[] args) {
		int[]arr= {9,8,10};
		int len=arr.length;
		int x=7;
		System.out.print(checkNumber(arr,x,len));

	}

}
