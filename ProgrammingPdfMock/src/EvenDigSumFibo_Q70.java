public class EvenDigSumFibo_Q70
{
    //Write a program to print even digit summation of 15 fibonacci numbers
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=1;
        int count=0;
        int sum=0;
        while (count<15)
        {
            int t=b;
            System.out.print(b+" ");
            while (t!=0)
            {
                int ld=t%10;
                if (ld%2==0)
                {
                    sum+=ld;
                }
                t/=10;
            }
            count++;
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("Sum "+sum);
    }
}
