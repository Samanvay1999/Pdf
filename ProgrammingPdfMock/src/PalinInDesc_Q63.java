import java.util.Scanner;

public class PalinInDesc_Q63
{
    //Write a program to print even palindrome numbers between 1 to 1000 in descending order
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = n; i >=m ; i--)
        {
            if (pal(i))
                System.out.println(i);

        }
    }
    static boolean pal(int n)
    {
        boolean st=false;
        int rev=0;
        int t=n;
        while (n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        if (rev==t)
            st=true;
        return st;
    }

}
