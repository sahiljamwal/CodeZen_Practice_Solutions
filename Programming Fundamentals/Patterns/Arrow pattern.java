//https://codezen.codingninjas.in/practice/463/680/arrow-pattern

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=(n+1)/2;
        int n2=n1-1;
        
        int i=1;
        while(i<=n1)
        {
            int space=1;
            while(space<=i-1)
            {
                System.out.print(" ");
                space++;
            }
            
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            
            
            
            System.out.println();
			i++;
        }
        
        i=n2;
        while(i>=1)
        {
            int space=1;
            while(space<=i-1)
            {
                System.out.print(" ");
                space++;
            }
            
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            
            
            
            
            System.out.println();
            i--;
        }
        
        
		
	}

}
