//https://codezen.codingninjas.in/practice/464/601/gcd


public class Solution {
	
	public static int gcd(int a,int b)
	{
		// Write your code here
        while(a!=b)
         {
             if(a>b)
                a=a-b;
            else
                b=b-a;
         }
         
         return a;
	}		
}