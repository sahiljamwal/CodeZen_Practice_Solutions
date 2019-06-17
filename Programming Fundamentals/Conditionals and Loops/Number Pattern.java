//https://codezen.codingninjas.in/practice/8549/472/number-pattern

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n-i+1)
			{
				System.out.print(j);
				j++;
			}
			
			
			
			
			
			System.out.println();
			i++;
		}

	}
}
