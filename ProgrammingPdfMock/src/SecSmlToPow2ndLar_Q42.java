import java.util.Scanner;

public class SecSmlToPow2ndLar_Q42
{
    //Write a program to find second smallest digit to the power of second largest digit of a number.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=secL(n);
        int n2=secS(n);
        System.out.println(n1);
        System.out.println(n2);
        int pro=1;
        for (int i = 1; i <=n2 ; i++)
        {
            pro=pro*n1;
        }
        System.out.println(pro);
    }
    static int secL(int n)
    {
        //54
        int f=0;
        int s=0;
        while (n!=0)
        {
            int ld=n%10;
            if (ld>f)
            {
                s=f;
                f=ld;
            }  if (ld<f)
            {
                if (ld>=s)
                s=ld;
            }
            n/=10;
        }
        return s;
    }
    static int secS(int n)
    {
        //154
        int f=9;
        int s=9;
        while (n!=0)
        {
            int ld=n%10;
            if (ld<f)
            {
                s=f;
                f=ld;
            }  if (ld<s)
            {
                if(ld>f)
                 s=ld;
            }
            n/=10;
        }
        return s;
    }
}
