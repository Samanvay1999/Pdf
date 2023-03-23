public class SumFibo
{
    //Write a program to print even digit summation of 15 fibonacci numbers
    public static void main(String[] args)
    {
        int a=0;
        int b=0;
        int c=1;
        int count=0;
        int sum=0;
        while(count<15)
        {
            int t=b;
            count++;
            System.out.print(b+" ");
            while (t!=0)
            {
                if (check(t%10))
                    sum+=t%10;
                t/=10;
            }

            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("sum "+sum);
    }
    public static boolean check(int n)
    {
        if(n%2==0)
            return true;
        else
            return false;
    }
}
