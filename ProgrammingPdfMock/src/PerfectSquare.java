public class PerfectSquare
{
    //Write a program to check 10th perfect square first digit is prime or not
    public static void main(String[] args)
    {
        int count=0;
        int num=1;
        while (count<10)
        {
            if (check(num))
            {
                System.out.print(num+" ");
                count++;
            }

            if (count==10)
            {
                System.out.println();
                System.out.println("10th perfect Square "+num);
                System.out.println(Check.prime(num % 10));
                break;
            }
            num++;
        }
    }
    public static boolean check(int n)
    {
        boolean st=false;
        for (int i = 1; i*i <=n; i++)
        {
            if(i*i==n)
            {
                st= true;
            }
            else
                st= false;
        }
        return st;
    }
}

