//https://codezen.codingninjas.in/practice/8546/955/average-marks


import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
        Scanner s =new Scanner(System.in);
		String str=s.next();
		char name=str.charAt(0);
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int d=(m1+m2+m3)/3;
		System.out.println(name);
		System.out.println(d);
	
	}

}
