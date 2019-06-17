//https://codezen.codingninjas.in/practice/467/91/remove-duplicates


public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        
        String ans="";
        
        
        ans+=s.charAt(0);
        
        int index=0;
        for(int i=1;i<s.length();i++)
        {
           
          
            
           if(ans.charAt(index)!=s.charAt(i))
            { 
                  index++;
                  ans+=s.charAt(i);
                
            }
           
        }
        return  ans;

	}

}