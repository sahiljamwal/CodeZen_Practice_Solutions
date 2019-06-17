//https://codezen.codingninjas.in/practice/463/669/galaxy-of-stars


public class solution {

	public static void print(int n) {
		//Write your code here
      
   		if(n%2==0)
            n=n+1;

        int n1=(n+1)/2;
        int n2=n1-1;

        int i=1;
        while(i<=n1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;          
             }




            System.out.println();
            i++;
        }

        i=n2;
        while(i>=1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

	}

}
