//https://codezen.codingninjas.in/practice/463/649/pattern_ify


public class Solution {

	public static void print(int n) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output.
	 	 * Taking input is handled automatically.
		 */
        
        int i=n;
        while(i>=0)
        {
            int value=1;
            while(value<=i)
            {
                System.out.print("*");
                value++;
            }

            System.out.println();
            i--;
        }
  }
}


