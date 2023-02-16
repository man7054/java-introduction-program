package recursion1.java;

public class firstIndexofx {
	public static int firstIndex(int input[], int x,int i) {
		if(i==input.length) {
			return -1;
		}
		else if(input[i]==x) {
			return i;
		}
		return firstIndex(input,x,i+1);
		
	}
	 public static int first(int arr[], int low, int high,int x, int n) {

           if (high >= low) {
           int mid = low + (high - low) / 2;
           if ((mid == 0 || x > arr[mid - 1])&& arr[mid] == x)
              return mid;
           else if (x > arr[mid])
        	   return first(arr, (mid + 1), high, x, n);
           else
        	   return first(arr, low, (mid - 1), x, n);
           }
           return -1;
	 }
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		
      return firstIndex(input,x,0);
	}
	public static void main(String[] args) {
		int[]arr= {9,0,10,8};
		int x=8;
		System.out.println(firstIndex(arr,x));
		System.out.print(first(arr,0,arr.length-1,x,arr.length));

	}

}
