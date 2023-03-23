import java.util.Scanner;

public class Fibo {
    //Write a program to print fibonacci numbers which has even digit in it.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ending value");
        int num= sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println("0");
        while (c<=num)
        {
            int temp=c;
            while (temp!=0)
            {
                int ld = temp % 10;
                if (ld % 2 == 0) {
                    System.out.println(c);
                    break;
                }
                temp /= 10;
            }
            c=a+b;
            a=b;
            b=c;
        }



    }
}
