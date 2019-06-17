//https://codezen.codingninjas.in/practice/463/665/repeat-triangle

public class solution {

	public static void print(int n) {
	//Write your code here
        
        int i=1;
        while(i<=n)
        {
            
            int space =1;
            while(space<=i-1)
            {
                System.out.print(" ");
                space++;
            }

            int j=1;
            int value=65;
            while(j<=n-i+1)
            {
                 System.out.print((char)value);
                 value++;
                 j++;
            }
            j--;
            value--;
            while(j>=1)
            {
                System.out.print((char)value);
                value--;

                j--;
            }


            System.out.println();
            i++;
        }
	}

}
