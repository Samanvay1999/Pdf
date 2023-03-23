import java.util.Scanner;

public class SecLarPriDig_Q69
{
    //Write a program to print second_largest prime digit in a given number
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        int t=m;
        int fl=0;
        int sl=0;
        while (t!=0)
        {
            int ld=t%10;
            if (Prime10FiboInDesc_Q64.pr(ld))
            {
                if (ld>=fl)
                {
                    sl=fl;
                    fl=ld;
                } else if (ld>=sl)
                {
                 sl=ld;
                }
            }
               t/=10;
        }
        System.out.println(sl);
    }
}
