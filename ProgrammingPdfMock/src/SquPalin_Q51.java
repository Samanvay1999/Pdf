import java.util.Scanner;

public class SquPalin_Q51
{
    /*Write a program to print the numbers after perfoming square it should be palindrome number between m and n.
            for example : n=11
           square=n*n=11*11=121(121 is palindrome number). */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
            int sq=i*i;
            if (PalinSum6Q40.palin(sq))
                System.out.println(i);
        }
    }

}
