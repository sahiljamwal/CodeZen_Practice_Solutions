//https://codezen.codingninjas.in/practice/463/654/give-me-triangle


public class solution {

	public static void print(int n) {
		//Write your code here
        int i=n;
        while(i>=0)
        {
            int space=1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int value=1;
            while(value<=i)
            {
                System.out.print("*");
                value++;
            }

            System.out.println();
            i--;
        }

	}

}
