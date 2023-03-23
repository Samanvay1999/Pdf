import java.util.Scanner;

public class SumTill_1_Q46 {
    /*  Write a program to print the numbers, whose sum of it's digits recursively calculated till single digit
        and that single digit should be 1 between m and n.
        for ex: n=325
        sumOfDigits1=3+2+5=10
        sumOfDigits2=1+0=1.*/
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
               int t=i;
               int sum=0;
               while (t>0 || sum>9)
               {
                   if (t==0)
                   {
                       t=sum;
                       sum=0;
                   }
                   sum+=t%10;
                   t/=10;
               }
               if (sum==1)
                   System.out.println(i);
        }

    }
}
