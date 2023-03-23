import java.util.Scanner;

public class PowerWithResp_Q75
{
    //WAP to print the numbers whose sum of it's digits powered with their respective position
    //is equal to the original number between m and n.
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
            int count=co(i);
            while (t!=0)
            {
                int ld=t%10;
                int pro=1;
                for (int j = 1; j <=count; j++)
                {
                    pro*=ld;
                }
                sum+=pro;
                t/=10;
                count--;
            }
            if (sum==i)
                System.out.println(i);
        }

    }
    static int co(int n)
    {
        int count=0;
        while (n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
}
