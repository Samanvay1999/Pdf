import java.util.Scanner;

public class AutomorphicNumber_Q89
{
    //Write a program to print the numbers which contains number itself at the end after
    //performing square of the number between m and n.
    //for example :
    //n=76
    //square = 76*76 = 5776
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        for (int i = m; i <=n ; i++)
        {
           if (auto(i))
               System.out.println(i);
        }
    }
    static boolean auto(int n)
    {
        boolean st=true;
        int sq=n*n;
        while (n!=0)
        {
            if (n%10!=sq%10)
            {
                st=false;
                break;
            }
            n/=10;
            sq/=10;
        }
        return st;
    }
}
