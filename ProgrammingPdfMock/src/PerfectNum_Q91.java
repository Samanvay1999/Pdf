import java.util.Scanner;

public class PerfectNum_Q91
{
    //Write a program to print perfect numbers between m and n whose summation of digits is less than 15
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
            if (per(i))
            {
                int t=i;
                while (t!=0)
                {
                    sum+=t%10;
                    t/=10;
                }
                if (sum<15)
                    System.out.println(i);
            }

        }

    }
    static boolean per(int n)
    {
        boolean st=false;
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0)
                sum+=i;
        }
        if (sum==n)
            st=true;
        return st;
    }

}
