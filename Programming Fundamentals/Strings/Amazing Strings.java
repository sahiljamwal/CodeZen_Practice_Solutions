//https://codezen.codingninjas.in/practice/467/724/amazing-strings

public class Solution {

	
	public static void answer(String s1,String s2,String s3)
	{

		// Write your code here
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        
        for(int i=0;i<s1.length();i++)
        {
            
            freq1[(int)s1.charAt(i)]++;
            
        }
        
        for(int i=0;i<s2.length();i++)
        {
            
            freq1[(int)s2.charAt(i)]++;
            
        }
        
        for(int i=0;i<s3.length();i++)
        {
            
            freq2[(int)s3.charAt(i)]++;
            
        }
        
        int flag=0;
        for(int i=0;i<freq1.length;i++)
        {
            
           if(freq1[i]==freq2[i])
           {
               flag=-1;
           }
            
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==-1)
            System.out.println("YES");
        else
            System.out.println("NO");
        
	}
	

	
}