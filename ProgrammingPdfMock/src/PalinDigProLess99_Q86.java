public class PalinDigProLess99_Q86
{
    //Write a program to print the palindrome numbers whose digits product is less than 99
    public static void main(String[] args)
    {
        int n=1;
        if (rev(n))
        {
            int t=n;
            int pro=1;
            while (t!=0)
            {
               pro=pro*t%10;
               t/=10;
            }
            if (pro<99)
            {
                System.out.println(n);
            }
        }
        n++;

    }
    static boolean rev(int n)
    {
        boolean st=false;
        int t=n;
        int rev=0;
        while (n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        if (t==rev)
            st=true;
        return st;
    }
}
