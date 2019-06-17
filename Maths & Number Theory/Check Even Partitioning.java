//https://codezen.codingninjas.in/practice/464/610/check-even-partitioning

public class Solution {

	public static boolean evenPartitionCheck(int a) {
		// Write your code here
        
        int n=a;
        int flag=0;
        if(n==2 && n%2!=0)
            flag=0;
        else if(n>=4 && n%2==0)
            flag=-1;
        
        if(flag==0)
            return false;
        else 
            return true;
	}
}