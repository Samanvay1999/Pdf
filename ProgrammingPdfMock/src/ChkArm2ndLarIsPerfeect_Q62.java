import java.util.Scanner;

public class ChkArm2ndLarIsPerfeect_Q62
{
    //Write a program to check whether the given number is ArmStrong or not,if it is a
    // ArmStrong number then check second largest digit of a given number is perfect number or not
    public static void main(String[] args)
    {
        System.out.println(secL(123));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        if (arm(m))
        {
            int sum=0;
            int sec=secL(m);
            int i;
            for ( i = 1; i <sec ; i++)
            {
                if(sec%i==0)
                {
                    sum+=i;
                }
            }
            if (sum==i)
                System.out.println(i+" is perfect number");
            else
                System.out.println(i+" is not a perfect number");
        }
    }
    static boolean arm(int n)
    {
        boolean st=false;
        int t=n;
        int t1=n;
        int sum=0;
        int count=0;
        while(t>0)
        {
            count++;
            t/=10;
        }
        while (t1>0)
        {
            int ld=t1%10;
            int pro=1;
            for (int i = 1; i <=count ; i++)
            {
              pro*=ld;
            }
            sum+=pro;
            t1/=10;
        }
        if (sum==n)
            st=true;

        return st;
    }
    static int secL(int n)
    {
        int fl=0;
        int sl=0;
        while (n!=0)
        {
            int ld=n%10;
            if (ld>=fl)
            {
                sl=fl;
                fl=ld;
            } else if (sl<=ld)
            {
             sl=ld;
            }
            n/=10;
        }
        return sl;
    }
}
