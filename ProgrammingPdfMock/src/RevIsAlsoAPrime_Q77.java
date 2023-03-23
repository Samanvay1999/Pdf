import java.util.Scanner;

public class RevIsAlsoAPrime_Q77
{
    //Write a program to print the prime numbers,
    //if the reversing order of the prime number gives you another prime number between
    //m and n.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
           if (Prime10FiboInDesc_Q64.pr(i));
            {
                int rev=rev(i);
                if (Prime10FiboInDesc_Q64.pr(rev))
                {
                    System.out.println(i);
                }
            }
        }

    }
    static int rev(int n)
    {
        int rev=0;
        while (n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}
