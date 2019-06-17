//https://codezen.codingninjas.in/practice/466/674/maximum-1s

public class solution {
	public static int max1(int arr[][])
	{
		//Write code here 
        
        int maxcount=0;
        int index=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                   
                }
            }
            if(count>maxcount)
            {
                maxcount=count;
                index=i;
            }
        }
       return index;
        
	}
}
