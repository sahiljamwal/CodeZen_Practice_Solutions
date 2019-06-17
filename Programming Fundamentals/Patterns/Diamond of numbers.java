//https://codezen.codingninjas.in/practice/463/670/diamond-of-numbers


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

            int space=1;
            while(space<=n1-i)
            {
                System.out.print(" ");
                space++;
            }

            int j=1;
            int value=j;
            while(j<=i)
            {
                System.out.print(value);
                value++;
                j++;
            }

            int k=1;
            value=i+1;
            while(k<=i-1)
            {
                System.out.print(value);
                value++;
                k++;
            }



            System.out.println();
            i++;
        }
        
        i=n2;
        while(i>=0)
        {
            int space=1;
            while(space<=n2-i+1)
            {
                System.out.print(" ");
                space++;
            }
            
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            
            int k=1;
            int value=i+1;
            while(k<=i-1)
            {
                System.out.print(value);
                value++;
                k++;
            }
            
            System.out.println();
            i--;
        }
        

	}

}
