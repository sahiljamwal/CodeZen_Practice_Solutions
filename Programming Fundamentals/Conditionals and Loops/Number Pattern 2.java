//https://codezen.codingninjas.in/practice/8549/470/number-pattern-2

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here

        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n)
        {
            if(i==1)
                 System.out.print("1");
            
            else
            {
                int j=1;
            while(j<=i)
            {
                if(j==1 || j==i)
                {
                     System.out.print(i-1);
                    j++;
                }
                else
                {
                    System.out.print("0");
                    j++;
                }
            }
                
            }
                
            
            
            
            
            
            
            
            System.out.println();
            i++;
        }
	}
}
