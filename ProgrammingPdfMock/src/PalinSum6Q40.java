import java.util.Scanner;

public class PalinSum6Q40
{
    //Write a program to print the palindrome numbers whose digits summation is 6 between m and n
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
            int sum=0;
            if(palin(i))
            {
                int t=i;
                while(t!=0)
                {
                    sum+=t%10;
                    t/=10;
                }
                if (sum==6)
                    System.out.println(i);
            }
        }
    }
    static boolean palin(int n)
    {
        boolean st=false;
        int rev=0;
        int t=n;
        while(t!=0)
        {
            rev=rev*10+t%10;
            t/=10;
        }
        if (rev==n)
            st=true;
        return st;
    }
}
