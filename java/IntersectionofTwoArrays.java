package Arrays1.java;

public class IntersectionofTwoArrays {
	 public static void intersections(int arr1[], int arr2[]) {
		 int n=arr1.length;
		 int m=arr2.length;
		 int i,j;
		 for(i=0;i<n;i++) {
			 for(j=0;j<m;j++) {
				 if(arr1[i]==arr2[j]) {
					 System.out.print(arr1[i]+" ");
					 arr2[j]=-1;
					 break;
				 }
			 }
		 }
	 }
	public static void main(String[] args) {
		int[]arr1= {10,10};
		int[]arr2= {10};
		intersections(arr1,arr2);

	}

}
