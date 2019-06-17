//https://codezen.codingninjas.in/practice/8546/1037/all-prime-numbers

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				
				if(i%j==0) 
				{
					flag=-1;
					break;
				}
				
				
			}
			if(flag==0)
				System.out.println(i);
		}
        
 
		
	}
}
