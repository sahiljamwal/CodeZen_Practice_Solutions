//https://codezen.codingninjas.in/practice/463/668/mirror-image-of-triangle


public class solution {

	public static void print(int n) {
		 //Write your code here
        n=n+1;
        int i=1;
         while(i<=n)
         {
             int space=1;
             while(space<=n-i)
             {
                 System.out.print(" ");
                 space++;
             }

             int j=1;
             int value=i-1;
             while(j<=i-1)
             {
                 System.out.print(value);
                 value--;
                 j++;
             }
            System.out.print("0");
            value++;
            j--;
            while(j>=1)
            {
                System.out.print(value);
                value++;


                j--;
            }

            



             System.out.println();
            i++;
         }
	}

}
