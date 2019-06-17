//https://codezen.codingninjas.in/practice/463/671/pattern:-triangle-of-numbers

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n)
        {
            int space=1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space++;
                
            }
            
            int j=1;
            int value=i;
            while(j<=2*i-1)
            {
                if(j==1 || j==2*i-1)
                {
                    value++;
                    System.out.print(i);
                    j++;
                }
                else if(j<i)
                {
                    
                    System.out.print(value);
                    value++;
                    j++;
                    
                }
                
                else if(j==i)
                {
                    
                    System.out.print(value);
                    value--;
                    j++;
                }
                
                else if(j>i)
                {
                    
                    System.out.print(value);
                    value--;
                    j++;
                }
                
                
            }
            
            
            System.out.println();
            i++;
        }
        
        
	}
}
