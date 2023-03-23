import java.util.Scanner;

public class Pattern_Q49
{
    /*3 3 3 3 3
        2 2 2
          1
        2 2 2
      3 3 3 3 3  */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t=n;
        int g=n;
        int s=0;
        int z=0;
        for (int i = 1; i <=(t*2-1) ; i++) {
            for (int j =0; j <s ; j++)
            {
                System.out.print(" ");
            }
            for (int j =(t*2-1); j>z; j--)
            {
                System.out.print(n);
            }
            System.out.println();
            if (i>=(t*2-1)/2+1)
            {
                s--;
                z-=2;
                n++;
            }
            else
            {
                z+=2;
                s++;
                n--;
            }
        }

        }

    }

