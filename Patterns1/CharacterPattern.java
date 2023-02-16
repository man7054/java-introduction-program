package Patterns1;
import java.util.*;
public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        char c='A';
        int n=sc.nextInt();
        int j;
        for(int i=0;i<n;i++){
            for( j=0;j<=i;j++){
                 
                System.out.print(c);
               c=(char)(c+1);
            }
            System.out.println();
            c=(char) ('A'+j);
            
        }

	}

}
