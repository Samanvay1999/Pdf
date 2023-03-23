import java.util.Scanner;

public class SpyFibo
{
    //Write a program to print spy fibonacci numbers between m and n.
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        int a=0,b=0,c=1;
        for (int i = m; i <=n ; i++)
        {
            while(b<=n)
            {
                if(b>=m && b<=n)
                {
                    if (spy(b))
                        System.out.println(b);
                }
                a=b;
                b=c;
                c=a+b;
            }
        }
    }
    public static boolean spy(int n)
    {
        boolean st=false;
        int t=n;
        int sum=0;
        int pro=1;
        while(t!=0)
        {
           int ld=t%10;
           sum+=ld;
           pro*=ld;
           t/=10;
        }
        if (sum==pro)
        {
            st=true;
        }
        return st;
    }
}
