import java.util.Scanner;

public class SumOfSqu_Q48
{
    /*Write a program to print the numbers whose sum of squares of its digits calculated
      till summation
      should be equal to 1.
      for ex : n=19
      1^2 + 9^2 = 82
      8^2 + 2^2 = 68
      6^2 + 8^2 = 100
      1^2 + 0^2 + 0^2 = 1*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
            int t=i;
            int sum=0;
            while(t!=0 || sum>9)
            {
                if (t==0)
                {
                    t=sum;
                    sum=0;
                }
                int ld=t%10;
                sum+=ld*ld;
                t/=10;
            }
            if (sum==1)
                System.out.println(i);
        }
        }
    }

