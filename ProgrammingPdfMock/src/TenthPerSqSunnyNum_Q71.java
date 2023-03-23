public class TenthPerSqSunnyNum_Q71
{
    //Write a program to check 10th perfect square number's first digit is sunny number or not.
    public static void main(String[] args) {
        int n=0;
        int c=0;
        while (c<10)
        {
            for (int i = 0; i * i <= n; i++)
            {
                if (i * i == n)
                {
                    c++;
                }
                if (c == 10)
                {
                    System.out.println(n);
                    int t=n;
                    while (t>10)
                    {
                        t/=10;
                    }
                    int t1=t+1;
                    for (int j = 1; j*j <=t1; j++)
                    {
                        if (j*j==(t1))
                        {
                            System.out.println("sunny number");
                            System.exit(0);
                        }

                    }
                    System.out.println("not a sunny number");
                }
            }
            n++;
        }
    }
}
