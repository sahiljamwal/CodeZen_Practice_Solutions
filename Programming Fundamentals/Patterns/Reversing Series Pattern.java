//https://codezen.codingninjas.in/practice/463/664/reversing-series-pattern

public class solution {

	public static void print(int n) {
		//Write your code here
        int i=1;
          int value=1;
          while(i<=n)
          {

                
                if(i%2==0)
                {
                    int j=i;
                    int temp=0;
                    temp=value+i-1;
                    
                    while(j>=1)
                    {
                        
                        System.out.print(temp+" ");
                        temp--;
                        value++;
                        j--;
                    }
                }
                else
                {
                    int j=1;
                    
                    while(j<=i)
                    {
                        System.out.print(value+" ");
                        value++;
                        j++;
                    }
                }



              System.out.println();
              i++;
          }

	}

}
