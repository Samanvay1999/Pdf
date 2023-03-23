import java.util.Scanner;

public class Pattern_Q65a
{
    /*    5 4 3 2 1
            4 3 2 1
              3 2 1
                2 1
                  1  */

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();

        for (int i = 0; i <m ; i++)
        {
              int t=m;
                  t-=i;
            for (int j = 0; j <i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = m; j >i ; j--) {
                System.out.print(t--);
            }
            System.out.println();
        }

    }
}
