import java.util.Scanner;

public class Pattern_Q93
{
    //        1
    //       212
    //      32123
    //     4321234
    //      32123
    //       212
    //        1
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = sc.nextInt();
        int s=1;

        for (int i = 0; i <m ; i++)
        {
            int t=1;
             t+=i;
            for (int j = 1; j <m-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <s ; j++) {
                System.out.print(t);
                if (j>=s/2)
                    t++;
                else
                    t--;

            }
            System.out.println();
            s+=2;
        }
        int z=(m*2)-3;
        for (int i = 0; i <m-1 ; i++) {
            int u=m-1;
            u-=i;
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <z; j++) {
                System.out.print(u);
                if (j>=z/2)
                    u++;
                else
                    u--;
            }
            System.out.println();
            z-=2;
        }

    }

}
