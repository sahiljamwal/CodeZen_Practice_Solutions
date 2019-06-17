//https://codezen.codingninjas.in/practice/465/25/duplicate-in-array

import java.util.Arrays;
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
 		int duplicate=arr[0];
        
        int flag=0;
        Arrays.sort(arr);
        	for(int i=1;i<arr.length;i++)
            {
                if(arr[i]==arr[i-1])
                {
                    duplicate=arr[i];
                    flag=-1;
                }
                    
            }
     
        return duplicate;
        
	}
}