//https://codezen.codingninjas.in/practice/465/699/division-of-4
//throws runtime for one test case comment if you are able to

public class solution {

	public static void change(int arr[])
	{
	//Write code here 
        
        int ans[]=new int[arr.length];
        
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i]/4;
            
            if(n!=0)
            {
                ans[index]=n;
                index++;
            }
            else
            {
                ans[index]=-1;
                index++;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ans[i];
        }
        
        
     }
}

