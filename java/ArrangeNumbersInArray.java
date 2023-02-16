package Arrays1.java;
import java.util.*;
public class ArrangeNumbersInArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n+1];
		int left=0;
		int right=n-1;
		int count=1;
		while(left<=right) {
			if(count%2==1) {
				arr[left]=count;
				count++;
				left++;
			}
			else {
				arr[right]=count;
				count++;
				right--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
