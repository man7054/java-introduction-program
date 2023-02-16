package recursion1.java;

public class CalculatePower {
    public static int power=0;
    public static int  power(int x,int n) {
    	if(n<0) {
    		return 1/power(x,-(n-1)*x);
    	}
    	if(n==0) {
    		return 1;
    	}
    	else {
    		return x*power(x,n-1);
    	}
    }
    	public static int  powers(int x,int n) {
        	if(n==0) {
        		return 1;
        	}
          int nx=powers(x,n/2);
          int ans=nx*nx;
          if(n%2==1) {
        	  ans=ans*x;
          }
          return ans;
    }
    
	    
	

	public static void main(String[] args) {
		int n=5;
		int x=2;
		System.out.print(powers(x,n));

	}

}
