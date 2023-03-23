public class StrongSecPrime_Q53
{
    //Write a program to check 10th strong number's second largest digit is prime or not
    public static void main(String[] args)
    {
        int count=0;
        int n=1;
        while (count<4)
        {
            int sum=0;
            int t=n;
            while (t!=0)
            {

                int ld=t%10;
                int pro=1;
                for (int i = ld; i >=1 ; i--) {
                    pro*=i;
                }
                sum+=pro;
                t/=10;
            }
            if (sum==n)
                count++;
            if (count==4)
            {
                System.out.println(n);
                int num=lar(n);
                if (prime(num))
                    System.out.println(num+" is prime");
                else
                    System.out.println(num+" is not prime");
                break;
            }
            n++;
        }

    }
    static int lar(int n)
    {
        int fl=0;
        int sl=0;
        while (n!=0)
        {
            int ld=n%10;
            if (ld>=fl)
            {
                sl=fl;
                fl=ld;
            }
            else if (sl<=ld)
            {
              sl=ld;
            }
            n/=10;
        }
        return sl;
    }
    static boolean prime(int n)
    {
        boolean st=true;
        for (int i = 2; i*i <=n; i++)
        {
            if (n%i==0)
                st=false;
        }
        if (n==1 || n==0)
            st=false;

        return st;
    }
}
