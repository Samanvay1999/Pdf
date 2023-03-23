import java.util.Scanner;

public class RevIsStrong
{
    //Write a program to check reverse of a number is Strong number or not
    public static void main(String[] args)
    {
        System.out.println(strong(145));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
         int num=rev(n);
         if (strong(num))
         {
             System.out.println("given num is Strong");
         }
         else
             System.out.println("not strong");
    }
    public static int rev(int n)
    {
        int rev=0;
        int t=n;
        while (t!=0)
        {
            rev=rev*10+t%10;
            t/=10;
        }
        return rev;
    }
    public static boolean strong(int n)
    {
        int sum=0;
        int t=n;
        while (n!=0)
        {
            int ld=n%10;
            int pro=1;
            for (int i = ld; i >0; i--)
            {
                pro=pro*i;
            }
            n/=10;
            sum+=pro;
        }
        if(t==sum)
            return true;
        else
            return false;
    }
}
