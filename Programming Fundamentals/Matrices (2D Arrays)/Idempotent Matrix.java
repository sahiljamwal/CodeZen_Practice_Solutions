//https://codezen.codingninjas.in/practice/466/2479/idempotent-matrix

																																																																																																																																																																																																																										
public class solution {
	
	public static boolean CheckIdempotent(int mat[][], int size){ 
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/ 
        
        int copy[][]=new int[mat.length][mat[0].length];
        int ans[][]=new int[copy.length][copy[0].length];
        int row=mat.length;
        int column=mat[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                copy[i][j]=mat[i][j];
            }
        }
        

        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                for(int k=0;k<column;k++)
                {
                    ans[i][j]+=mat[i][k]*copy[k][j];
                }
            }
        }
        
        boolean flag=false;
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
               if(mat[i][j]==ans[i][j])
                   flag=true;
                else
                {
                    flag=false;
                    break;
                }
            }
        }
        
              
        
        
        
        return flag;
    }
}
