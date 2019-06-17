//https://codezen.codingninjas.in/practice/8906/475/decimal-to-binary

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []ans=new int[1000];
		
		int i=0;
		while(n!=0)
		{
			int q=n/2;
			int r=n%2;
			ans[i]=r;
			n=q;	
			i++;
		}
		
		int j=i-1;
		while(j>=0)
		{
			System.out.print(ans[j]);
			j--;
		}
	}
}


