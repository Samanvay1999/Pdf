import java.util.Scanner;

public class Q93
{
    //        1
    //       212
    //      32123
    //     4321234
    //      32123
    //       212
    //        1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = sc.nextInt();
        int col=1;
        int sp=m-1;
        int n;
        for (int i = 0; i <m*2-1 ; i++) {
            if (i<m) {
                n = 1;
                n += i;
            }
            else
            {
                n=m*2-1;
                n=n-i;

            }
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <col ; j++) {
                System.out.print(n);
                if (j>=col/2)
                    n++;
                else
                    n--;
            }
            System.out.println();
            if (i<m-1) {
                col+= 2;
                sp--;
            }
            else
            {
                col-=2;
                sp++;
            }
        }
    }
}
