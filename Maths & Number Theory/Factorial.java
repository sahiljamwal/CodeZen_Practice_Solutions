//https://codezen.codingninjas.in/practice/464/602/factorial

import java.math.BigInteger;
public class Solution {
	
	public static void fact(int n) {
		// Write your code here
        BigInteger  fac=new BigInteger("1");
        for(int i=1;i<=n;i++)
        {
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        if(n==0)
            System.out.println("1");
        else 
             System.out.println(fac);
	}		
}