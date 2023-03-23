import java.util.Scanner;

public class First10Fibo
{
    //Write a program to print first 10 fibonacci series
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to print series ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        int count=2;
        while (count<=10)
        {
            c=a+b;
            count++;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}
