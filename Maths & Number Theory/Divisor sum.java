//https://codezen.codingninjas.in/practice/464/608/divisor-sum


public class Solution {

	public static int divSum(int a) {
		// Write your code here
        
        int ans=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                ans+=i;
            }
        }
        
        return ans;
	}		
    
    
    
}