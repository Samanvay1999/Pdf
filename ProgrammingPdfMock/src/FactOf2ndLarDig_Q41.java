import java.util.Scanner;

public class FactOf2ndLarDig_Q41
{
    //Write a program to print factorial of second largest digit of a number
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sec=sec(n);
        int pro=1;
        for (int i = sec; i >=1 ; i--)
        {
            pro*=i;
        }
        System.out.println(pro);

    }
    static int sec(int n)
    {
        //29435
        int f=0;
        int s=0;
        while (n!=0)
        {
            int ld=n%10;
            if (ld>f)
            {
                s=f;
                f=ld;
            } else if (ld<=f && ld>=s)
            {
               s=ld;
            }
            n/=10;
        }
        return s;
    }
}
