package Arrays1.java;

public class TripletSum {
	public static int findTriplet(int[] arr, int x) {
		 int count=0;
	        for (int i = 0; i < arr.length; i++){
	            for (int j = i + 1; j < arr.length; j++){
	                for(int k=j+1;k<arr.length;k++){
	                if ((arr[i] + arr[j]+arr[k]) == x){
	                    count++;
	                }
	                }
	                
	            }
	        }
	                
	                    
	        return count;
	}
	public static void main(String[] args) {
		int[]arr= {1,3,6,2,5,4,3,2,4};
		int x=5;
		System.out.print(findTriplet(arr,x));

	}

}
