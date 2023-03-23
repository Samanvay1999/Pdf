import java.util.Scanner;

public class NumPower_Q47 {
    //WAPTP the numbers whose sum of its digit raised to the power of their respective
    //positions is equal to the number itself between i and j.
    //for ex: n=175.
    //n=1^1+7^2+5^3=175.
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
            int t=i;
            int count=count(i);
            while (t!=0)
            {
                int ld=t%10;
                int pro=1;
                for (int j = 1; j <=count ; j++)
                {
                     pro*=ld;
                }
                sum+=pro;
                count--;
                t/=10;
            }
            if (sum==i)
                System.out.println(i);
        }

    }
    static int count(int n)
    {
        int c=0;
        while (n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
}
