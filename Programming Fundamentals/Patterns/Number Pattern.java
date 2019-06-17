//https://codezen.codingninjas.in/practice/463/667/number-pattern

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        int i=n;
        while(i>=1)
        {
            int j=1;
            int value=i;
            while(j<=n)
            {
                if(value==n)
                {
                    System.out.print(value);
                    j++;
                }
                else
                {
                    System.out.print(value);
                    value++;
                    j++;
                }
            }



            System.out.println();
            i--;
        }
        

		
	}

}
