//https://codezen.codingninjas.in/practice/8549/486/total-salary

import java.util.Scanner;
import java.lang.Math; 

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int bs=s.nextInt();
		String str=s.next();
		char g=str.charAt(0);
		
		double hra=(0.2)*bs;
		double da=(0.5)*bs;
		double pf=(0.11)*bs;
		
		int al=0;
		if(g=='A')
			al=1700;
		else if(g=='B')
			al=1500;
		else
			al=1300;
		
		double ts=bs+hra+da+al-pf;
		
		System.out.println(Math.round(ts));

	}
}


