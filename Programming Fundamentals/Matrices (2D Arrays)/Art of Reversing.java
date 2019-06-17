//https://codezen.codingninjas.in/practice/466/673/art-of-reversing

public class solution {
	public static void printreverse(int arr[][])
	{
	//Write code here 
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[0].length-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
