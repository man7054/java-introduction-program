package Arrays1.java;
public class FindUnique {
	 public static int findUnique(int[] arr) {
		 int n=arr.length;
	       int res = arr[0];
	        for (int i = 1; i <n; i++)
	            res = res ^ arr[i];
	    
	        return res;
			 
		 }

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,2,6};
		System.out.print(findUnique(arr));

	}

}
