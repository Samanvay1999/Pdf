public class Prime10FiboInDesc_Q64
{
    //Write a program to print 10 prime fibonacci numbers in descending order
    public static void main(String[] args)
    {
        int a=0;
        int b=0;
        int c=1;
        int count=0;
        int arr[]=new int[10];
        int len= arr.length-1;
        while (count<10)
        {
            if (pr(b))
            {
                arr[len]=b;
                len--;
                count++;
                System.out.print(b+" ");
            }
            a=b;//34
            b=c;//55
            c=a+b;//88
        }
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static boolean pr(int n)
    {
        boolean st=true;
        for (int i = 2; i*i <=n ; i++)
        {
            if (n%i==0) {
                st = false;
                break;
            }
        }
        if (n==1 || n==0)
            st=false;
        return st;
    }
}
