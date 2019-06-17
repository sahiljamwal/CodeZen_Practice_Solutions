//https://codezen.codingninjas.in/practice/8549/471/number-pattern-3

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                if(j==1 || j==i)
                {
                     System.out.print("1");
                    j++;
                }
                else
                {
                    System.out.print("2");
                    j++;
                }
            }
            
            
            
            System.out.println();
            i++;
        }
	}
}
