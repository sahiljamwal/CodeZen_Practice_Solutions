//https://codezen.codingninjas.in/practice/465/358/all-consecutive-elements
//throws runtime for one test case comment if you are able to

import java.util.Arrays;

public class Solution {

	// input - input array
	public static boolean containsConsecutiveNumbers(int[] input){
		// Write your code here		
        
       Arrays.sort(input);

                int flag=0;
        int n=input.length;
        
        		
             
                  for(int i=0;i<input.length-1;i++)
                {
                    if(input[i+1]>=input[i]+1)
                    {
                        flag=-1;
                    }
                    else

                    {
                        flag=0;
                        break;
                    }
                }
                
             
               
                if(flag==-1 || input.length==1)
                    return true;
                else 
                    return false;
	}
	
}
