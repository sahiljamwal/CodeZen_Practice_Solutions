//https://codezen.codingninjas.in/practice/467/731/internet_address

import java.util.Scanner;

public class Solution {

	public static void sol(String str) {
		// Write your code here	
        String ans="";

        int index=0;
        int strindex=0;
      
        
            for(int i=0;i<str.length();i++)
            {
                
                if(str.charAt(i)=='p')
                {
                    ans+=str.charAt(i);
                    index++;
                    strindex=index;
                    ans+="://";
                    index=index+3;
                    break;
                }
                else
                {
                    ans+=str.charAt(i);
                    index++;
                }
            }

            for(int i=strindex;i<str.length()-1;i++)
            {
                if(str.charAt(i)=='r' && str.charAt(i+1)=='u')
                {
                    ans+=".ru/";
                    index=index+4;
                    strindex=strindex+2;
                    break;
                    
                }
                else
                {
                    ans+=str.charAt(i);
                    index++;
                    strindex++;
                }
            }

            for(int i=strindex;i<str.length();i++)
            {
                ans+=str.charAt(i);
            }

            System.out.println(ans);

        
	}
	
}
