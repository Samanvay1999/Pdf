import java.util.Scanner;

public class PrimeDigInPalin
{
    //Write a program to count number prime digits present in first 10 palindrome
    public static void main(String[] args)
    {

        int num=1;
        int count=0;
        int prime=0;
        while (count<10)
        {
            if (Check.palin(num)) {
                count++;
                int t = num;
                while (t != 0) {
                    int ld = t % 10;
                    if (Check.prime(ld)) {
                        prime++;
                        System.out.print(t % 10 + " ");
                    }
                    t /= 10;
                }
            }
            num++;
        }
        System.out.println("prime "+prime);
    }

}
class Check
{
    public static boolean palin(int n)
    {
        int temp=n;
        int rev=0;
        while (temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if (rev==n)
        return true;
        else
            return false;
    }
    public static boolean prime(int n)
    {
        boolean st=true;
        if(n>=2)
        {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    st = false;
                }
            }
        } else if (n==0 || n==1)
        {
            st=false;
        }
        return st;
    }
}