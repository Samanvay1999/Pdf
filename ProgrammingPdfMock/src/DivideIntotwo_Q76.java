import java.util.Scanner;

public class DivideIntotwo_Q76
{
    //WAPTP the numbers which has an even number of digits and the number can be
    //divided exactly into two parts from the middle.
    //After equally dividing the number, sum up the numbers and find the square of the sum.
    //If we get the number itself as square then print that numbers between m and n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++)
        {
           int t = i;
           int sum = 0;
           int sq = 0;
           int count = count(i);
        if (count % 2 == 0) {
            int middle = count / 2;
            int p = 1;
            for (int j = 0; j < middle; j++) {
                p *= 10;
            }
            int f = i % p;
            int s = t / p;
            sum = f + s;
            sq = sum * sum;
            if (i==sq)
                System.out.println(i);
        }
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
