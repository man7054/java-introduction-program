package recursion2.java;

public class BinarySearchre {
    public static int binarysearch(int[]arr,int x,int start,int end) {
    	int mid=start+(end-start)/2;
    	if(start>end) {
    		return -1;
    	}
        if(arr[mid]==x) {
    		return mid+1;
    	}
        else if(arr[mid]<x) {
        	return binarysearch(arr,x,mid+1,end);
        }
        else {
        	return binarysearch(arr,x,start,mid-1);
        }
    }
	public static void main(String[] args) {
		int[]arr= {1,2,4,5,6,7,9};
		int x=6;
		System.out.print(binarysearch(arr,x,0,arr.length-1));

	}

}
