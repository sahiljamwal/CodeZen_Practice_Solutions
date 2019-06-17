//https://codezen.codingninjas.in/practice/8546/463/find-character-case

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
        Scanner s = new Scanner(System.in);
        String str= s.next();
        char c=str.charAt(0);
        //int i=c;
        
        if(c>='A' && c<='Z')
        	System.out.println("1");
        else if(c>='a' && c<='z')
        	System.out.println("0");
        else
        	System.out.println("-1");

	}
}
