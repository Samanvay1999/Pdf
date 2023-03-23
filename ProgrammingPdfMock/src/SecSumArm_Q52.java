import java.util.Scanner;

public class SecSumArm_Q52
{
    //Write a program to perform summation of second smallest digit of numbers between x and y.
    //and check whether the summation is Arm strong number or not.
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println(small(35));
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        int sum=0;
        for (int i = m; i <=n ; i++)
        {
            int num=small(i);
            sum+=num;
        }
        if (arm(sum))
            System.out.println(sum+" is a armstrong number");
        else
            System.out.println(sum+" is not a armstrong number");
    }
    static boolean arm(int n)
    {
        int t=n;
        int t1=n;
        int count=0;
        int sum=0;
        while (t!=0)
        {
            count++;
            t/=10;
        }
        while (t1!=0)
        {
            int ld=t1%10;
            int pro=1;
            for (int i = 0; i <count ; i++)
            {
             pro*=ld;
            }
            sum+=pro;
            t1/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    static int small(int n)
    {
        int fs=9;
        int ss=9;
        while(n!=0)
        {
           int ld=n%10;
           if (ld<=fs)
           {
               ss=fs;
               fs=ld;
           }
           else if (ss>=ld)
           {
               ss=ld;
           }
           n/=10;
        }
        return ss;
    }
}
