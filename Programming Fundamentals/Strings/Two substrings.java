//https://codezen.codingninjas.in/practice/467/717/two-substrings

public class Solution {

	
	public static void twoSubstrings(String str)
	{
		// Write your code here
        
        char arr[]=str.toCharArray();
        char ans[]=new char[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            ans[index]=arr[i];
            index++;
        }
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ans[i])
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
            System.out.println("no");
        else
            System.out.println("yes");
            
        
	}
}
