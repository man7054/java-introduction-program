package Arrays1.java;

public class FindDuplicate {
    public static int duplicateNumber(int arr[]) {
    	 int n=arr.length;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(j!=i){
                     if(arr[i]==arr[j]){
                         return arr[i];
                     }
                 }
             }
         }
         return -1;
    }
	public static void main(String[] args) {
	    int[] arr= {0,7,2,5,4,7,1,3,6};
	    System.out.print(duplicateNumber(arr));

	}

}
