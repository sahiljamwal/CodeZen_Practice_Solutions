//https://codezen.codingninjas.in/practice/8546/971/nth-fibonacci-number

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int first=0;
		int second=1;
		int third;
		int []term=new int[1000];
		term[0]=first;
		term[1]=second;
		
		for(int i=3;i<=n+1;i++)
		{
			third=first+second;
			term[i-1]=third;
			first=second;
			second=third;
			
			
		}
		System.out.println(term[n]);
	}

}
