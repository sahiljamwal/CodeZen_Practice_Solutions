//https://codezen.codingninjas.in/practice/463/662/binary-pattern


public class solution {

	public static void print(int n) {
        
         int i=n;
        while(i>=0)
        {
            int j=1;
            while(j<=i)
            {
                if((n-i+1)%2==0)
                {
                    System.out.print("0");
                    
                }
                else
                {
                    System.out.print("1");
                }
                j++;
            }



            System.out.println();
            i--;
        }
       
	}

}
