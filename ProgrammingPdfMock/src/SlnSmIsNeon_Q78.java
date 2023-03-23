import java.util.Scanner;

public class SlnSmIsNeon_Q78
{
    //WAP to check summation of second_largest digit and second_smallest digit of a number is Neon number or not.
    //Neon number: Summation of the digits of square of the given is equal to the original number.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        int sl=SecSmlToPow2ndLar_Q42.secL(m);
        int sm=SecSmlToPow2ndLar_Q42.secS(m);
        int sum=sl+sm;
        int t=sum;
        int sum1=0;
        while (t!=0)
        {
            int ld=t%10;
            sum1+=ld*ld;
            t/=10;
        }
        if (sum1==sum)
            System.out.println(sum +" is neon number");
        else
            System.out.println(sum+" is not neon");
    }
}
