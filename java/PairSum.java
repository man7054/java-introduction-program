package Arrays1.java;

public class PairSum {
    public static int pairSum(int[]arr,int x) {
    	 int n=arr.length;
         int count=0;
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(arr[i]+arr[j]==x){
                        count++;
                 }
             }
         }
     	
 return count;
    }
	public static void main(String[] args) {
		int[]arr= {1,3,6,2,5,4,3,2,4};
		int x=2;
		System.out.print(pairSum(arr,x));

	}

}
