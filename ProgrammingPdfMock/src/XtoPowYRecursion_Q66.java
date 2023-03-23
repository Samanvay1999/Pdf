import java.util.Scanner;

public class XtoPowYRecursion_Q66
{
    //x to the power of y in recursion
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        int ans=pow(m,n);
        System.out.println(ans);
    }
    static int pow(int x,int y)
    {
        if (y==0)
        {
            return 1;
        }
        return x*pow(x,y-1);
    }
}
