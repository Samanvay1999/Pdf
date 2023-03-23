import java.util.Scanner;

public class FactRecursion_Q65
{
    //Factorial of a given number using recursion
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        int n=fact(m);
        System.out.println(n);
    }
    static int fact(int n)
    {
        if (n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
