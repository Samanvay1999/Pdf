import java.util.Scanner;

public class Pattern_Q65
{
    /*     5
           5 4
           5 4 3
           5 4 3 2
           5 4 3 2 1 */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        for (int i = 1; i <=m ; i++)
        {
            int t=m;
            for (int j =1 ; j <=i; j++)
            {
                System.out.print(t--);
            }
            System.out.println();
        }

    }
}
