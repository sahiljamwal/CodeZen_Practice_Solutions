//https://codezen.codingninjas.in/practice/8546/965/sum-of-even-numbers-till-n

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int sum=0;
		
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i=i+1;
		}
		System.out.println(sum);
		
	}

}
